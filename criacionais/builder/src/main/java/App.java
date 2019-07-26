public class App {

    public static void main(String[] args) {

       Character character = CharacterBuilder.builder()
               .withName("Lucas")
               .withAge(24)
               .withClassName(ClassName.MAGE)
               .withSkill("Fire Bolt", "Bolt of fire", "Fire", 30)
               .withSkill("Ice Bolt", "Bolt of ice", "Ice", 25)
               .build();

        System.out.println(character);
    }
}
