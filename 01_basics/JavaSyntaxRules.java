// Day 2
// Topic: Java Syntax Rules and Common Beginner Mistakes

class JavaSyntaxRules {

    public static void main(String[] args) {

        System.out.println("Understanding Java syntax rules");

        // Rule 1: Java is case sensitive
        String name = "Manav";
        System.out.println(name);

        // Wrong example (will cause error)
        // string name = "Manav";

        // Rule 2: main method syntax must be exact
        // Correct:
        // public static void main(String[] args)

        // Wrong examples:
        // static public void main(String[] args)
        // public void static main(String[] args)

        // Rule 3: Cannot use keywords as identifiers
        // Example:
        // class new { }  ❌
        // class class { } ❌

        // Rule 4: Predefined classes should not be misused
        // Example: using String or System incorrectly

        // Rule 5: Java file name should match class name
        // Example: Program1.java -> class Program1

        System.out.println("Syntax rules practice complete.");

    }
}
