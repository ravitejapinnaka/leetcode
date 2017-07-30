public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
        return intervals;
        
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        List<Interval> result = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for(Interval intv: intervals){
            if(intv.start<=end){
                end= Math.max(end,intv.end);
            }
            else{
                result.add(new Interval(start,end));
                start=intv.start;
                end=intv.end;             
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
}