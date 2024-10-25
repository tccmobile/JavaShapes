# JavaShapes
Class Example

This example demonstrates several key concepts:

1. The `Drawable` interface defines a contract for drawing behavior with three methods: `draw()`, `setColor()`, and `getColor()`.

2. The abstract `Shape` class:
   - Implements the `Drawable` interface
   - Provides common fields and implementations for color-related methods
   - Defines an abstract method `calculateArea()`
   - Provides a concrete method `moveShape()` that all shapes can use

3. Concrete classes (`Circle` and `Rectangle`):
   - Extend the abstract `Shape` class
   - Implement the remaining abstract methods
   - Add their own specific properties and behaviors

The code shows how you can combine interfaces and abstract classes to:
- Define contracts (interface)
- Share common code (abstract class)
- Force implementation of certain methods (abstract methods)
- Provide default implementations where appropriate

[UML Diagram](https://claude.site/artifacts/c2cbb1af-9283-4d78-8dd4-fe610f735f15)
