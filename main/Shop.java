package main;


/**
 * This class initializes the shop and every purchasable entity.
 * The animals, crops and items are all created here.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Shop {
	
	/**
	 * A potato crop
	 */
	private static Potato potato = new Potato();
	/**
	 * A rice crop
	 */
	private static Rice rice = new Rice();
	/**
	 * A wheat crop
	 */
	private static Wheat wheat = new Wheat();
	/**
	 * A corn crop
	 */
	private static Corn corn = new Corn();
	/**
	 * A sugarcane crop
	 */
	private static Sugarcane sugarcane = new Sugarcane();
	/**
	 * A berry crop
	 */
	private static Berry berry = new Berry();
	/**
	 * A chicken
	 */
	private static Chicken chicken = new Chicken();
	/**
	 * A pig
	 */
	private static Pig pig = new Pig();
	/**
	 * A sheep
	 */
	private static Sheep sheep = new Sheep();
	/**
	 * A cow
	 */
	private static Cow cow = new Cow();
	/**
	 * A horse
	 */
	private static Horse horse = new Horse();
	/**
	 * The item water sprinklers
	 */
	private static WaterSprinklers waterSprinklers = new WaterSprinklers();
	/**
	 * The single pruchase item scarecrow
	 */
	private static Scarecrow scarecrow = new Scarecrow();
	/**
	 * The single purchase item stables
	 */
	private static Stables stables = new Stables();
	/**
	 * The single purchase item animal feeder
	 */
	private static AnimalFeeder animalFeeder = new AnimalFeeder();
	/**
	 * The single purchase item animal toys
	 */
	private static Toys animalToys = new Toys();
	/**
	 * The single purchase item time machine
	 */
	private static TimeMachine timeMachine = new TimeMachine();
	/**
	 * The normal item energy bar
	 */
	private static EnergyBar energyBar = new EnergyBar();
	/**
	 * The normal item fertilizer
	 */
	private static Fertiliser fertiliser = new Fertiliser();
	/**
	 * The normal item weed killer
	 */
	private static WeedKiller weedKiller = new WeedKiller();
	/**
	 * The normal item animal treats
	 */
	private static AnimalTreats animalTreats = new AnimalTreats(); 
	
	
	/**
	 * Getter for a potato crop.
	 * 
	 * @return a potato crop
	 */
	public static Potato getPotato() {
		return potato;
	}
	
	/**
	 * Initializes a potato crop.
	 * 
	 * @param potato a potato crop
	 */
	public static void setPotato(Potato potato) {
		Shop.potato = potato;
	}
	
	/**
	 * Getter for a rice crop.
	 * 
	 * @return a rice crop
	 */
	public static Rice getRice() {
		return rice;
	}
	
	/**
	 * Initializes a rice crop.
	 * 
	 * @param rice a rice crop
	 */
	public static void setRice(Rice rice) {
		Shop.rice = rice;
	}
	
	/**
	 * Getter for a wheat crop.
	 * 
	 * @return a wheat crop
	 */
	public static Wheat getWheat() {
		return wheat;
	}
	
	/**
	 * Initializes a wheat crop.
	 * 
	 * @param wheat a wheat crop
	 */
	public static void setWheat(Wheat wheat) {
		Shop.wheat = wheat;
	}
	
	/**
	 * Getter for a corn crop.
	 * 
	 * @return a corn crop
	 */
	public static Corn getCorn() {
		return corn;
	}
	
	/**
	 * Initializes a corn crop.
	 * 
	 * @param corn a corn crop
	 */
	public static void setCorn(Corn corn) {
		Shop.corn = corn;
	}
	
	/**
	 * Getter for a sugarcane crop.
	 * 
	 * @return a sugarcane crop
	 */
	public static Sugarcane getSugarcane() {
		return sugarcane;
	}
	
	/**
	 * Initializes a sugarcane crop.
	 * 
	 * @param sugarcane a sugarcane crop
	 */
	public static void setSugarcane(Sugarcane sugarcane) {
		Shop.sugarcane = sugarcane;
	}
	
	/**
	 * Getter for a berry crop.
	 * 
	 * @return a berry crop
	 */
	public static Berry getBerry() {
		return berry;
	}
	
	/**
	 * Initializes a berry crop.
	 * 
	 * @param berry a berry crop
	 */
	public static void setBerry(Berry berry) {
		Shop.berry = berry;
	}
	
	/**
	 * Getter for a chicken.
	 * 
	 * @return a chicken
	 */
	public static Chicken getChicken() {
		return chicken;
	}
	
	/**
	 * Initializes a chicken.
	 * 
	 * @param chicken a chicken
	 */
	public static void setChicken(Chicken chicken) {
		Shop.chicken = chicken;
	}
	
	/**
	 * Getter for a pig.
	 * 
	 * @return a pig
	 */
	public static Pig getPig() {
		return pig;
	}
	
	/**
	 * Initializes a pig.
	 * 
	 * @param pig a pig
	 */
	public static void setPig(Pig pig) {
		Shop.pig = pig;
	}
	
	/**
	 * Getter for a sheep.
	 * 
	 * @return a sheep
	 */
	public static Sheep getSheep() {
		return sheep;
	}
	
	/**
	 * Initializes a sheep.
	 * 
	 * @param sheep a sheep
	 */
	public static void setSheep(Sheep sheep) {
		Shop.sheep = sheep;
	}
	
	/**
	 * Getter for a cow.
	 * 
	 * @return a cow
	 */
	public static Cow getCow() {
		return cow;
	}
	
	/**
	 * Initializes a cow.
	 * 
	 * @param cow a cow
	 */
	public static void setCow(Cow cow) {
		Shop.cow = cow;
	}
	
	/**
	 * Getter for a horse.
	 * 
	 * @return a horse
	 */
	public static Horse getHorse() {
		return horse;
	}
	
	/**
	 * Initializes a horse.
	 * 
	 * @param horse a horse
	 */
	public static void setHorse(Horse horse) {
		Shop.horse = horse;
	}

	/**
	 * Getter for the single purchase item water sprinklers.
	 * 
	 * @return the single purchase item water sprinklers
	 */
	public static WaterSprinklers getWaterSprinklers() {
		return waterSprinklers;
	}
	
	/**
	 * Initializes the single purchase item water sprinklers.
	 * 
	 * @param waterSprinklers the single purchase item water sprinklers
	 */ 
	public static void setWaterSprinklers(WaterSprinklers waterSprinklers) {
		Shop.waterSprinklers = waterSprinklers;
	}
	
	/**
	 * Getter for the single purchase item scarecrow.
	 * 
	 * @return the single purchase item scarecrow
	 */
	public static Scarecrow getScarecrow() {
		return scarecrow;
	}
	
	/**
	 * Initializes the single purchase item scarecrow.
	 * 
	 * @param scarecrow the single purchase item scarecrow
	 */
	public static void setScarecrow(Scarecrow scarecrow) {
		Shop.scarecrow = scarecrow;
	}
	
	/**
	 * Getter for the single purchase item stables.
	 * 
	 * @return the single purchase item stables
	 */
	public static Stables getStables() {
		return stables;
	}
	
	/**
	 * Initializes the single purchase item stables.
	 * 
	 * @param stables the single purchase item stables
	 */
	public static void setStables(Stables stables) {
		Shop.stables = stables;
	}
	
	/**
	 * Getter for the single purchase item animal feeder.
	 * 
	 * @return the single purchase item animal feeder
	 */
	public static AnimalFeeder getAnimalFeeder() {
		return animalFeeder;
	}
	
	/**
	 * Initializes the single purchase item animal feeder.
	 * 
	 * @param animalFeeder the single purchase item animal feeder
	 */
	public static void setAnimalFeeder(AnimalFeeder animalFeeder) {
		Shop.animalFeeder = animalFeeder;
	}
	
	/**
	 * Getter for the single purchase item animal toys.
	 * 
	 * @return the single purchase item animal toys
	 */
	public static Toys getAnimalToys() {
		return animalToys;
	}
	
	/**
	 * Initializes the single purchase item animal toys.
	 * 
	 * @param animalToys the single purchase item animal toys
	 */
	public static void setAnimalToys(Toys animalToys) {
		Shop.animalToys = animalToys;
	}
	
	/**
	 * Getter for the single purchase item time machine.
	 * 
	 * @return the single purchase item time machine
	 */
	public static TimeMachine getTimeMachine() {
		return timeMachine;
	}
	
	/**
	 * Initializes the single purchase item time machine.
	 * 
	 * @param timeMachine the single purchase item time machine
	 */
	public static void setTimeMachine(TimeMachine timeMachine) {
		Shop.timeMachine = timeMachine;
	}
	
	/**
	 * Getter for the normal item energy bar.
	 * 
	 * @return the normal item energy bar
	 */
	public static EnergyBar getEnergyBar() {
		return energyBar;
	}
	
	/**
	 * Initializes the normal item energy bar.
	 * 
	 * @param energyBar the normal item energy bar
	 */
	public static void setEnergyBar(EnergyBar energyBar) {
		Shop.energyBar = energyBar;
	}
	
	/**
	 * Getter for the normal item fertilizer.
	 * 
	 * @return the normal item fertilizer
	 */
	public static Fertiliser getFertiliser() {
		return fertiliser;
	}
	
	/**
	 * Initializes the normal item fertilizer.
	 * 
	 * @param fertiliser the normal item fertilizer
	 */
	public static void setFertiliser(Fertiliser fertiliser) {
		Shop.fertiliser = fertiliser;
	}
	
	/**
	 * Getter for the normal item weed killer.
	 * 
	 * @return the normal item weed killer
	 */
	public static WeedKiller getWeedKiller() {
		return weedKiller;
	}
	
	/**
	 * Initializes the normal item weed killer.
	 * 
	 * @param weedKiller the normal item weed killer
	 */
	public static void setWeedKiller(WeedKiller weedKiller) {
		Shop.weedKiller = weedKiller;
	}
	
	/**
	 * Getter for the normal item animal treats.
	 * 
	 * @return the normal item animal treats
	 */
	public static AnimalTreats getAnimalTreats() {
		return animalTreats;
	}
	
	/**
	 * Initializes the normal item animal treats.
	 * 
	 * @param animalTreats the normal item animal treats
	 */
	public static void setAnimalTreats(AnimalTreats animalTreats) {
		Shop.animalTreats = animalTreats;
	}
	
	
}
