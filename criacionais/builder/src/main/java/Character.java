import java.util.List;

public class Character {

    private String nickName;
    private Integer age;
    private ClassName className;
    private List<Skill> skills;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public List<Skill> getSkills() {
        return this.skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Character{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", className=" + className +
                ", skills=" + skills +
                '}';
    }
}
