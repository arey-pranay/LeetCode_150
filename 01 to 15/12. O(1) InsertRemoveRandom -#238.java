class RandomizedSet {

    Map<Integer, Integer> dict;
    List<Integer> list;

    Random rand;

    public RandomizedSet() {
        dict = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();

    }

    public boolean insert(int val) {

        if (dict.containsKey(val))
            return false;

        int pos = list.size();

        dict.put(val, pos);
        list.add(pos,val);
        return true;

    }

    public boolean remove(int val) {

        if (!dict.containsKey(val))
            return false;

        int pos = dict.get(val);

        int lastElement = list.get(list.size() - 1);
        list.set(pos,lastElement);
        dict.put(lastElement, pos);

        list.remove(list.size() - 1);
        dict.remove(val);

        return true;

    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
