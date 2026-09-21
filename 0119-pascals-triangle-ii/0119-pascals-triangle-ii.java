
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

       
        result.add(1);

       
        for (int i = 1; i <= rowIndex; i++) {
            long prevElement = (long) result.get(i - 1);
           
            long currentElement = prevElement * (rowIndex - i + 1) / i;
            result.add((int) currentElement);
        }

        return result;
    }
}