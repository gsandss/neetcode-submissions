class TimeMap {

    private HashMap<String, ArrayList<String[]>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new String[]{String.valueOf(timestamp), value});
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        ArrayList<String[]> list = map.get(key);

        int l = 0;
        int r = list.size() - 1;
        String answer = "";

        while(l <= r){
            int mid = l + (r-l) / 2;

            int time = Integer.parseInt(list.get(mid)[0]);

            if(time <= timestamp){
                answer = list.get(mid)[1];
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return answer;

    }
}
