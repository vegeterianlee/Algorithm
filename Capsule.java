public class Capsule {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        // private 메서드 checkName 사용
        this.name = checkName(name) ? name : "anonymous";
    }

    // 이름을 입력할 때 공백 인지 확인 하는 메서드
    // Capsule 클래스 내부에서만 사용할 것이기 때문에 private
    private boolean checkName(String name) {
        return name.length() > 0;
    }
}

class CapsuleMain {
    public static void main(String[] args) {
        Capsule capsule = new Capsule();
        // capsule.age; // private 제어자 이기 때문에 접근 불가능
        // capsule.name; // private 제어자 이기 때문에 접근 불가능

        // 따라서 직접 접근이 아니라 private 이 아닌 메서드를 통해서 접근한다.
        capsule.setAge(28);
        capsule.setName("bin");

        System.out.println("capsule.getName() = " + capsule.getName());
        System.out.println("capsule.getAge() = " + capsule.getAge());

        capsule.setName("");
        System.out.println("capsule.getName() = " + capsule.getName());
    }
}