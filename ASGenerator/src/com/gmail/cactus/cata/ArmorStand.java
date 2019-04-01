package com.gmail.cactus.cata;

public class ArmorStand {
	
	public ArmorStand(){
		
	}
	
	private float rot, rotHead1, rotHead2, rotLeftLeg1, rotLeftLeg2, rotRightLeg1, rotRightLeg2, rotLeftArm1,
			rotLeftArm2, rotRightArm1, rotRightArm2;
	private int tabint[] = { 1, 0, 1, 0, 1, 1, 1, 0, 2039583 };
	private String tabstring[] = { "NoGravity", "Invisible", "ShowArms", "Small", "NoBasePlate", "Invulnerable",
			"PersistenceRequired", "CustomNameVisible", "DisabledSlots" };

	public void setRotation(float rot, float rotHead1, float rotHead2, float rotLeftLeg1, float rotLeftLeg2,
			float rotRightLeg1, float rotRightLeg2, float rotLeftArm1, float rotLeftArm2, float rotRightArm1,
			float rotRightArm2) {

		this.rot = rot;
		this.rotHead1 = rotHead1;
		this.rotHead2 = rotHead2;
		this.rotLeftLeg1 = rotLeftLeg1;
		this.rotLeftLeg2 = rotLeftLeg2;
		this.rotRightLeg1 = rotRightLeg1;
		this.rotRightLeg2 = rotRightLeg2;
		this.rotLeftArm1 = rotLeftArm1;
		this.rotLeftArm2 = rotLeftArm2;
		this.rotRightArm1 = rotRightArm1;
		this.rotRightArm2 = rotRightArm2;

	}

	public void setDataTags() {
		System.out.println("Les informations sur votre armorstand sont les suivantes : \n" + tabstring[0] + ':'
				+ tabint[0] + " (0)\n" + tabstring[1] + ':' + tabint[1] + " (1)\n" + tabstring[2] + ':' + tabint[2]
				+ " (2)\n" + tabstring[3] + ':' + tabint[3] + " (3)\n" + tabstring[4] + ':' + tabint[4] + " (4)\n"
				+ tabstring[5] + ':' + tabint[5] + " (5)\n" + tabstring[6] + ':' + tabint[6] + " (6)\n" + tabstring[7]
				+ ':' + tabint[7] + " (7)\n" + tabstring[8] + ':' + tabint[8]
				+ " (8)\nVoulez-vous modifier quelque chose ?");
		System.out.println("Voulez-vous modifier des DataTags ?");

	}

	public void show() {
		System.out.println("/colorcommand /summon ArmorStand ~ ~0.5 ~ {Rotation:[" + rot + "f]," + tabstring[0] + ":"
				+ tabint[0] + "b," + tabstring[1] + ":" + tabint[1] + "b," + tabstring[2] + ":" + tabint[2] + "b,"
				+ tabstring[3] + ":" + tabint[3] + "b," + tabstring[4] + ":" + tabint[4] + "b," + tabstring[5] + ":"
				+ tabint[5] + "b," + tabstring[6] + ":" + tabint[6] + "b," + tabstring[7] + ":" + tabint[7] + "b,"
				+ tabstring[8] + ":" + tabint[8]
				+ ",Equipment:[{id:\"minecraft:potato\",Count:1b,tag:{display:{Name:\"&5&k!&r&3&l[&6&lSuper Anniv de la Patate&3&l]&5&k!&r\",Lore:[\"&bAllez tous sur son profil et &4&oSPAMMER BON ANNIV&b :D&r\",\"&e&lCollectez le plus de &6&lpatate &e&lavant la fin de l'event !!&r\"]},ench:[{id:-1,lvl:1}]}},{id:\"minecraft:leather_boots\",tag:{display:{color:13557796},ench:[{id:-1,lvl:1}]}},{id:\"minecraft:leather_leggings\",tag:{display:{color:11583263},ench:[{id:-1,lvl:1}]}},{id:\"minecraft:leather_chestplate\",tag:{display:{color:13557796}}},{id:\"minecraft:skull\",Damage:3,tag:{SkullOwner:VBT_Killhawk}}],DisabledSlots:1973790,Pose:{Head:["
				+ rotHead1 + "f," + rotHead2 + "f,0f],LeftLeg:[" + rotLeftLeg1 + "f," + rotLeftLeg2 + "f,0f],RightLeg:["
				+ rotRightLeg1 + "f," + rotRightLeg2 + "f,0f],LeftArm:[" + rotLeftArm1 + "f," + rotLeftArm2
				+ "f,0f],RightArm:[" + rotRightArm1 + "f," + rotRightArm2 + "f,0f]},Small:1b,CustomName:\"anniv\"}");
	}

}
