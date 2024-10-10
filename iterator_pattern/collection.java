public class collection implements container{
    String name[] = { "Ashik", "Joy", "Sabbir" };
    @Override
    public iterator getiterator() {
        return new nameiterator();
    }

    public class nameiterator implements iterator {
        int index = 0;
        @Override
        public boolean hasnext() {
            if (index < name.length)
                return true;
            return false;
        }

        @Override
        public String next() {
            if (hasnext())
                return name[index++];
            return null;
        }
        
    }
    
}
