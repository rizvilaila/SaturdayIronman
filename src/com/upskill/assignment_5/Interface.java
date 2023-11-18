package com.upskill.assignment_5;

public interface Interface {
	public abstract void iDoor();
	public abstract String iEngine();
	
	public abstract int iSeat();
	public abstract void iColor();
}
/*
(Parent)				   (Keyword) 				(Child)									
Class						extends			 		Class
Abstract Class	(+2)		extends			 		Class	(-2)
Interface		(+2)		implements				Class	(-2)
Interface		(+2)		extends					Interface (+2)		implements		Class(-4)
interface					implements				abstract class
abstract class				extends					interface			implements		class (-4)
*/