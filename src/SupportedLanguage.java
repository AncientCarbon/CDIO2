/**
 * Use enums when you have values that you know aren't going to change,
 * e.g. month days, days, colors, deck of cards, etc.
 *
 * An enum can, just like a class, have attributes and methods.
 * Difference:
 * - enum constants are public, static and final (unchangeable - cannot be overridden)
 * - an enum cannot be used to create objects
 * - an enum cannot extend other classes (but it can implement interfaces)
 */

public enum SupportedLanguage {
    DANISH,
    ENGLISH
}
