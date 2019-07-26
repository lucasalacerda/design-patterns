import java.util.ArrayList;
import java.util.List;

public class CharacterBuilder {

    Character character;
    List<Skill> skills;

    public CharacterBuilder() {
        this.character = new Character();
        this.skills = new ArrayList<>();
    }

    public static CharacterBuilder builder() {
        return new CharacterBuilder();
    }

    public CharacterBuilder withName(String name) {
        this.character.setNickName(name);
        return this;
    }

    public CharacterBuilder withAge(Integer age) {
        this.character.setAge(age);
        return this;
    }

    public CharacterBuilder withClassName(ClassName className) {
        this.character.setClassName(className);
        return this;
    }

    public CharacterBuilder withSkill(String name, String description, String type, Integer power) {
        Skill skill = new Skill();
        skill.setName(name);
        skill.setDescription(description);
        skill.setType(type);
        skill.setPower(power);
        this.skills.add(skill);
        this.character.setSkills(this.skills);

        return this;
    }

    public Character build() {
        return this.character;
    }
}
