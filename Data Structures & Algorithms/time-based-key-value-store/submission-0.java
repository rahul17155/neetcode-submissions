class TimeMap {
    
    class pair{
        String value;
        int timestamp;
        public pair(String value,int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }
    }
    private Map<String,List<pair>>map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<pair>ls=map.get(key);
        if(ls==null){
            ls=new ArrayList<>();
            ls.add(new pair(value,timestamp));
            map.put(key,ls);
        }else{
            ls.add(new pair(value,timestamp));
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)==null){
            return "";
        }
        List<pair>val=map.get(key);
        int left=0;
        int right=val.size()-1;
        String result="";
        while(left<=right){
            int mid=(left+right)/2;
            if(val.get(mid).timestamp==timestamp){
                return val.get(mid).value;
            }
            else if(val.get(mid).timestamp<timestamp){
                result=val.get(mid).value;
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return result;
    }
}
