Singleton Creational Design Pattern

When an only one private instance of a class is needed, which is created only once, cannot be changed or have copies of it created elsewhere but is accesible globally

Structure:
1. The class of the single instance (singleton) is responsible for access and "initialization on first use"
2. The constructor is private, so it cannot be used to create an instance elsewhere
3. The single instance is a private static attribute.
4. The accessor function is a public static method.

When is Singleton unnecessary? When it's simpler to pass an object resource as a reference to the objects that need it, rather than letting objects access the resource globally.

Singleton is practically a type of global variable and we should generally avoid the use of it! :)