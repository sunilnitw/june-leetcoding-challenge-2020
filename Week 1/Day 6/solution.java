class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int []>(){
            public int compare(int a[], int b[]){
                if(a[0] == b[0]){
                    return a[1] - b[1];
                } else {
                    return b[0] - a[0];
                }
            }
        });
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(people.length); 
        for(int i =0; i<people.length; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>(2);
            temp.add(people[i][0]);
            temp.add(people[i][1]);
            list.add(people[i][1], temp);
        }
        for(int i=0; i<people.length; i++){
            ArrayList l = list.get(i);
            people[i][0] = (Integer)l.get(0);
            people[i][1] = (Integer)l.get(1);
        }       
        return people;
    }
}