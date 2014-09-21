package Challenges;

import sun.tools.java.Type;

import java.util.*;

/**
 * Created by vineet on 9/20/14.
 *
 * Given a set of intervals , find the interval with max number of intersections
 *
 * Create an Event for each endpoint of an interval
 * Sort the events(nlogn)
 * initialize startCount and endCount = 0
 * for each start event {
 *   startCount = startCount + 1
 *   interval.startCount = startCount
 *   interval.endCount = endCount;
 * }
 *
 * for each end event{
 *   endCount = endCount + 1;
 *   interval.numberOfIntersections = startCount - interval.endCount -1
 *   // number of intersections = present start count - number of events that had ended by the beginning of the interval -1
 * }
 *
 *
 */
public class IntervalWithMaxIntersections {

  static class Event implements Comparable{
    Type type;
    int time;
    Interval interval;

    @Override
    public int compareTo(Object o) {
      return this.time - ((Event)o).time;
    }

    enum Type{
      START,
      END
    };

    Event(Type type , int time , Interval interval){
      this.type = type;
      this.time = time;
      this.interval = interval;
    }

  }
  static class Interval implements Comparable{
    int startCount;
    int endCount;
    Event startEvent;
    Event endEvent;
    int startTime;
    int endTime;

    Interval(int startTime , int endTime){
      this.startTime = startTime;
      this.endTime = endTime;
      startEvent = new Event(Event.Type.START , startTime , this);
      endEvent = new Event(Event.Type.END , endTime , this);
    }

    public int getStartCount() {
      return startCount;
    }

    public void setStartCount(int startCount) {
      this.startCount = startCount;
    }

    public int getEndCount() {
      return endCount;
    }

    public void setEndCount(int endCount) {
      this.endCount = endCount;
    }

    int numberOfIntersections;

    @Override
    public int compareTo(Object o) {
      return startTime - ((Interval)o).startTime;
    }

    @Override
    public String toString(){
      return new String("("+ startTime +"," + endTime + ")");
    }
  }

  public static void getIntervalWithMaxIntersections(HashSet<Interval> intervalSet){
    ArrayList<Event> eventQueue = new ArrayList<Event>();
    for(Interval obj: intervalSet){
      eventQueue.add(obj.startEvent);
      eventQueue.add(obj.endEvent);
    }
    Collections.sort(eventQueue);
    for(Interval obj: intervalSet){
      System.out.println(obj.toString());
    }


    //Start and end counters
    int start = 0;
    int end = 0;

    //Process events in order
    for (Event ev: eventQueue){
      if(ev.type == Event.Type.START){
        start = start+1;
        ev.interval.setStartCount(start);
        ev.interval.setEndCount(end);
      }
      else if(ev.type == Event.Type.END){
        end = end + 1;
        ev.interval.numberOfIntersections = start - ev.interval.getEndCount()-1;
      }
    }

    int maxIntersections = 0;
    Interval intervalMax = null;
    for(Interval interval : intervalSet){
      if(maxIntersections < interval.numberOfIntersections){
        maxIntersections = interval.numberOfIntersections;
        intervalMax = interval;
      }
    }

    System.out.println("The interval with max Number of intersections :("+ intervalMax.startTime + ","+ intervalMax.endTime+")");
    System.out.println("The number of intersections :" + intervalMax.numberOfIntersections);

  }

  public static void main(String args[]){

    HashSet<Interval> intervalSet = new HashSet<Interval>();
    intervalSet.add(new Interval(1 , 3));
    intervalSet.add(new Interval(2 , 5));
    intervalSet.add(new Interval(6 , 8));
    intervalSet.add(new Interval(7 , 9));
    intervalSet.add(new Interval(2, 10));


    getIntervalWithMaxIntersections(intervalSet);

  }
}
