# OOP in Java – Exam Prep Plan

Based on: mock exam (17.12.2025), Lab 1, Lab 2, lecture slides 1–10 (Prof. Antosch), Hensel workbook.
The Hensel workbook is extra practice material; its chapters follow the lecture order:
imperative concepts → classes → libraries → inheritance → abstract classes → GUI → exceptions → I/O → threads.

## What the exam actually tests (mock exam, 105 points)

| Part | Points | What it is |
|---|---|---|
| A: Explain 5 concepts with an example | 10 | encapsulation, polymorphism, constructor, interface, abstract class |
| B: Explain concepts | 15 | inheritance + `super`, overloading vs overriding, public/private/protected |
| C: True/False | 16 | rules like "a static method can access instance variables" |
| D: Fill in code | 12 | write a `Circle` class: private field, constructor, getter, setter with validation, methods, `toString()` |
| E: Find bugs | 12 | missing `;`, `gpa = gpa`, a static method using instance fields, a missing `private` |
| F: Programming | 40 | a `Contact` + `ContactBook` app with an `ArrayList` and add/delete/search/display |

**Conclusion:** almost everything is OOP (lectures 3, 5, 6) plus one "entity class + manager class" program.
Chapter 2 topics like math formulas, π series and bisection never appear. Chapter 2 only matters as the
basic tools: `if`, loops, `/` and `%`, `printf`, casting.

(The mock exam header says 90 min but lists 60 + 60 min. Ask which is correct.)

## Chapter 2: what to do

**Do these.** They cover the basics the labs and exam need:

| Ex. | Why |
|---|---|
| 7 TeamPlayers | `/` vs `%`, used constantly |
| 9 PeriodSeconds | `%`, `printf("%02d")` |
| 11 ThrowDice | random numbers; Lab 1 uses `Random` |
| 12 + 13 LeapYear | `if`/`else`, then the same logic with `&&` and `\|\|` |
| 14 MathCircle | `final` and validation, the same idea as the setter in exam Task D |
| 15 LoopTypes | `for`, `while`, `do/while`, which come up in the True/False questions |
| 16 PrintNumbers | loops + even/odd with `%` |
| 19 DiceDistribution | counting in a loop, a pattern used all over the labs |
| **Questions 5–24** | **all of them.** Exactly exam Task C style (`7/2`, `(int) 7.1 + 3.5`, `switch`, `break`/`continue`) |

- **Optional, if you have time:** 3, 17, 18, 20
- **Skip:** 4, 5, 6, 8, 10, 21, 22, 23, 24, 25 (physics and math formulas, not Java practice)

From Chapter 3 on, the workbook becomes much more useful: classes, getters/setters, constructors, `static`.
**Spend most of your time on Chapters 3–6.**

## Why the prof wants UML

- **UML isn't in the mock exam.** It's a **design tool** for the labs: Lab 2 says to draw the diagram first and only code afterwards.
- **It trains what the exam awards points for:** which classes you need, which fields are `private` (−), which methods are `public` (+), their types and return types = "proper OOP design and encapsulation" in Task F.
- **Lab 2 Task 6 (Item + Inventory) has the same shape as exam Task F (Contact + ContactBook).** That UML is your plan for the exam program.
- **The workbook has UML too,** but only from Chapter 3 on (no classes in Chapter 2 yet).

**What you need to know about UML: class diagrams only.**
- A box with class name / attributes / methods
- `-` private, `+` public, `#` protected
- `name: String`, `getName(): String`, `setRadius(r: double): void`
- static = underlined, abstract = *italic*
- Arrows: inheritance (hollow triangle), interface (dashed + triangle), composition/aggregation (filled/hollow diamond)

In the exam, spend 3 minutes sketching the classes before coding Task F. It saves time.

## How to practise (beginner plan)

1. **After each lecture:** answer that chapter's workbook **questions** in `theory-answers.md` → material for Tasks B and C.
2. **Concept cards** for the Task A/B terms: definition + 3–5 line code example each. The exam always asks for an example.
3. **Workbook exercises:** Chapter 3 (Person, Book, Song, getters/setters, static), Chapter 4 (String, arrays, `ArrayList`), Chapters 5–6 (inheritance, abstract classes, interfaces).
4. **Master one pattern: entity class + manager class.** E.g. Contact/ContactBook, Item/Inventory, Book/Library, Student/Course:
   - private fields, constructor, getters, `toString()`
   - an `ArrayList` with add (with validation), delete, case-insensitive search returning an object or `null`, display (handle the empty case)
   - a `main` that tests everything

   Repeat it from a blank file until you can do it in **40 minutes without help**.
5. **Write code on paper** for Task D (no autocomplete). Write a class like `Circle` by hand once a week.
6. **Debugging checklist** for Task E: missing `;`, `x = x` instead of `this.x = x`, `static` method using instance fields, fields not `private`, missing getters, missing `return`, wrong types.
7. **Last week:** do the mock exam under exam time, **then** check the solution pages.
