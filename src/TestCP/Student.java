package TestCP;


    public class Student implements Comparable<Student> {
        public String name;
        public int age;



        public Student(String name, int age) {
            this.name = name;
            this.age = age;

        }
        public Student(){

        }


        @Override
        public String toString() {
            return "Student{" +
                    "name=" + name + '\'' +
                    ", age= " + age +
                    '}';
        }

        @Override
        public int compareTo(TestCP.Student o) {
            return this.name.compareTo(o.name);

        }


    }

