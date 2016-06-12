package fizzbuzz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class FizzBuzz {

  private final Collection<MultipleReplacer> replacers = Arrays.asList(
    new MultipleReplacer(3, "Fizz"),
    new MultipleReplacer(5, "Buzz")
  );

  public String get(int n) {
    return replacers.stream()
      .map(r -> r.textFor(n))
      .filter(Optional::isPresent)
      .map(Optional::get)
      .reduce((a, b) -> a + b)
      .orElse(Integer.toString(n));
  }

}
