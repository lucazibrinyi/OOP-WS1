public class Range {

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
        if (this.start>this.end){
            this.start=this.end;
            this.end=start;
        }
    }

    private Integer start;

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer range) {
        this.end = start+range;
    }

    private Integer end;

    public Range(int range){
        start=0;
        end=range;
    }

    public Range(Integer start, Integer end){
        this.start=start;
        this.end=end;
//        if (start>end){
//            throw new IndexOutOfBoundsException();
//        }
        
    }
    
    public Integer lengthOfRange(){
        Integer range=end-start;
        return range;
    }


}
