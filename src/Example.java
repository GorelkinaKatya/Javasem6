/*
public class Example {
    public class Sem6 {
        public static void main(String[] args) {
            Cat cat1 = new Cat("Мурка","Василий Петрович","чеширский", 8);
            Cat cat2 = new Cat("Рыжик","Василий Петрович","чеширский", 8, "голодный");
            Cat cat3 = new Cat("Рыжик","Василий Петрович","чеширский", 8, "голодный");
            System.out.println(cat1);
            System.out.println(cat2);
            Set<Cat> set = new HashSet<>();
            set.add(cat1);
            set.add(cat2);
            set.add(cat3);
            System.out.println(set);
            System.out.println(cat2.equals(cat3));
        }
        static void task0(){
            Integer[] arr = {1,23,5,6,1,5,7};

            Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
            Set<Integer> set2 = new TreeSet<>(Arrays.asList(arr));
            Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(arr));

            System.out.println(set1);
            System.out.println(set2);
            System.out.println(set3);


        }

        private String name;
        private String owner;
        private String breed;
        private int age;

        private String comm;
        private List<String> healthHistory;

        public Cat(String name, String owner, String breed, int age){
            this.name = name;
            this.age = age;
            this.owner = owner;
            this.breed = breed;
            this.comm = "без комментариев";
        }

        public Cat(String name, String owner, String breed, int age, String comm){
            this.name = name;
            this.age = age;
            this.owner = owner;
            this.breed = breed;
            this.comm = comm;
        }

        @Override
        public String toString() {
            return "name : " + name + "\nowner : " + owner + "\nage : " + age + "\nbreed : " + breed + "\nкомментарий : " + comm + "\n";
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj){
                return true;
            }
            if(!(obj instanceof Cat)){
                return false;
            }
            Cat cat = (Cat) obj;
            return name.equals(cat.name) && breed.equals(cat.breed) && age == cat.age && owner.equals(cat.owner);
        }

        @Override
        public int hashCode() {
            return 18 * age + 8 * breed.hashCode() + 9 * owner.hashCode() + 21 * name.hashCode();
        }
    }
}
*/
