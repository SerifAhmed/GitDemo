package JavaBasics;

public class ChildAirCraft extends ParentAirCraft {

	public static void main(String[] args) {
		ChildAirCraft childObj = new ChildAirCraft();
		childObj.safetyGuidelines();
		childObj.engineGuidelines();
		childObj.bodyColour();
		
		ParentAirCraft parentObj = new ChildAirCraft();
		parentObj.safetyGuidelines();
		parentObj.engineGuidelines();
		parentObj.bodyColour();
		
		//ParentAirCraft parentObj2 = new ParentAirCraft();	NOT POSSIBLE

	}

	@Override
	public void bodyColour() {
		System.out.println("Red colour on the body");
		
	}

}

/*
==================================================
💡 ABSTRACT CLASS & POLYMORPHISM QUICK NOTE
==================================================

1️ Why this is NOT possible:
    ParentAirCraft obj = new ParentAirCraft();  // ❌ ERROR
    - Because ParentAirCraft is ABSTRACT.
    - Abstract classes can have unimplemented (abstract) methods.
    - They are just blueprints, not complete objects.
    - You cannot directly create objects from a blueprint.

2️ Why this IS possible:
    ParentAirCraft obj = new ChildAirCraft();   // ✅ WORKS
    - We are creating a ChildAirCraft object (concrete class).
    - ChildAirCraft has implemented all abstract methods from ParentAirCraft.
    - Variable type = ParentAirCraft (reference type)
      Object type   = ChildAirCraft (actual object in memory)

3️ Key Concept — POLYMORPHISM:
    - A parent type reference can hold a child type object.
    - Method calls are resolved at runtime (dynamic method dispatch).
    - Reference type decides:
         -> What methods you can call.
      Object type decides:
         -> Which method implementation is executed.

4️ Simple Analogy:
    - Abstract class = Building Blueprint 🏗️
    - Child class    = Real Building 🏠
    - You can’t live in a blueprint (abstract object).
      You CAN live in a real building built from the blueprint.
==================================================
*/		
