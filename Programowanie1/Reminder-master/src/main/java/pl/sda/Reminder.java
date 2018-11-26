package pl.sda;

import java.util.*;

public class Reminder {

    private static final List<Album> ALBUMS = Arrays.asList(
            new Album("Album 0", Arrays.asList(
                    new Track("Track 0.1", 3),
                    new Track("Track 0.2", 2),
                    new Track("Track 0.3", 2),
                    new Track("Track 0.4", 1),
                    new Track("Track 0.5", 1)
            )),
            new Album("Album 1", Arrays.asList(
                    new Track("Track 1.1", 3),
                    new Track("Track 1.2", 5),
                    new Track("Track 1.3", 6),
                    new Track("Track 1.4", 1),
                    new Track("Track 1.5", 4)
            )),
            new Album("Album 2", Arrays.asList(
                    new Track("Track 2.1", 1),
                    new Track("Track 2.2", 6),
                    new Track("Track 2.3", 3),
                    new Track("Track 2.4", 4),
                    new Track("Track 2.5", 4),
                    new Track("Track 2.6", 2)
            )),
            new Album("Album 3", Arrays.asList(
                    new Track("Track 3.1", 1),
                    new Track("Track 3.2", 2),
                    new Track("Track 3.3", 3)
            ))
    );


    public static void main(String[] args) {
        //streamConvert();
        sortedSetConvert();
    }

    private static void streamConvert() {
        System.out.println("Input streamConvert: " + Arrays.toString(ALBUMS.toArray()));


        Set<Album> favs2 = new HashSet<>();
        //boolean hasFavorite2 =false;
        ALBUMS.stream()
                .forEach(x-> x.tracks.stream()
                        .forEach(y->{if(y.rating>=4){favs2.add(x);}}));

        List<Album> favs = new ArrayList<>(favs2);
//        for (Album a : ALBUMS) {
//            boolean hasFavorite = false;
//
//            for (Track t : a.tracks) {
//                if (t.rating >= 4) {
//                    hasFavorite = true;
//                    break;
//                }
//            }
//            if (hasFavorite)
//                favs.add(a);
//        }

        Collections.sort(favs, (a1, a2) -> a1.name.compareTo(a2.name));

        System.out.println("Result streamConvert: " + Arrays.toString(favs.toArray()));
        favs.stream()
                .forEach(System.out::println);
    }

    private static void sortedSetConvert() {
        List<String> args = Arrays.asList("x", "xxx", "xx", "x");
        Set<String> s = new SortedSet<String>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        s.addAll(args);
        System.out.println("Result sortedSetConvert: " + s.size() + " distinct words: " + s);
    }

}
