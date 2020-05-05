package ie.cct.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import ie.cct.animalmodel.Animal;
import ie.cct.animalmodel.Bird;
import ie.cct.animalmodel.Cat;
import ie.cct.animalmodel.Dog;
import ie.cct.animalmodel.Horse;
import ie.cct.animalmodel.Rabbit;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class Helper {

	// Function to Generate Animals Names
	public static String nameGenerator() {

		// Array of Names (1000 names)
		// Names got from :
		// https://www.petplace.com/article/dogs/pet-care/top-1200-pet-names/
		String[] petName = { "ABBEY", "ABBIE", "ABBY", "ABEL", "ABIGAIL", "ACE", "ADAM", "ADDIE", "ADMIRAL", "AGGIE",
				"AIRES", "AJ", "AJAX", "ALDO", "ALEX", "ALEXUS", "ALF", "ALFIE", "ALLIE", "ALLY", "AMBER", "AMIE",
				"AMIGO", "AMOS", "AMY", "ANDY", "ANGEL", "ANGUS", "ANNIE", "APOLLO", "APRIL", "ARCHIE", "ARGUS",
				"ARIES", "ARMANTI", "ARNIE", "ARROW", "ASHES", "ASHLEY", "ASTRO", "ATHENA", "ATLAS", "AUDI", "AUGIE",
				"AUSSIE", "AUSTIN", "AUTUMN", "AXEL", "AXLE", "BABBLES", "BABE", "BABY", "BABY-DOLL", "BABYKINS",
				"BACCHUS", "BAILEY", "BAM-BAM", "BAMBI", "BANDIT", "BANJO", "BARBIE", "BARCLAY", "BARKER", "BARKLEY",
				"BARLEY", "BARNABY", "BARNEY", "BARON", "BART", "BASIL", "BAXTER", "BB", "BEAMER", "BEANIE", "BEANS",
				"BEAR", "BEAU", "BEAUTY", "BEAUX", "BEBE", "BEETLE", "BELLA", "BELLE", "BEN", "BENJI", "BENNY",
				"BENSON", "BENTLEY", "BERNIE", "BESSIE", "BIABLO", "BIBBLES", "BIG BOY", "BIG FOOT", "BIGGIE", "BILLIE",
				"BILLY", "BINGO", "BINKY", "BIRDIE", "BIRDY", "BISCUIT", "BISHOP", "BITS", "BITSY", "BIZZY", "BJ",
				"BLACKIE", "BLACK-JACK", "BLANCHE", "BLAST", "BLAZE", "BLONDIE", "BLOSSOM", "BLUE", "BO", "BO", "BOB",
				"BOBBIE", "BOBBY", "BOBO", "BODIE", "BOGEY", "BONES", "BONGO", "BONNIE", "BOO", "BOO-BOO", "BOOKER",
				"BOOMER", "BOONE", "BOOSTER", "BOOTIE", "BOOTS", "BOOZER", "BORIS", "BOSCO", "BOSLEY", "BOSS", "BOY",
				"BOZLEY", "BRADLEY", "BRADY", "BRAGGS", "BRANDI", "BRANDO", "BRANDY", "BRIDGETT", "BRIDGETTE", "BRIE",
				"BRINDLE", "BRIT", "BRITTANY", "BRODIE", "BROOK", "BROOKE", "BROWNIE", "BRUISER", "BRUNO", "BRUTUS",
				"BUBBA", "BUBBLES", "BUCK", "BUCKEYE", "BUCKO", "BUCKY", "BUD", "BUDDA", "BUDDIE", "BUDDY", "BUDDY BOY",
				"BUFFIE", "BUFFY", "BUG", "BUGSEY", "BUGSY", "BULLET", "BULLWINKLE", "BULLY", "BUMPER", "BUNKY",
				"BUSTER", "BUSTER-BROWN", "BUTCH", "BUTCHY", "BUTTER", "BUTTERBALL", "BUTTERCUP", "BUTTERSCOTCH",
				"BUTTONS", "BUZZY", "CAESAR", "CALI", "CALLIE", "CALVIN", "CAMEO", "CAMILLE", "CANDY", "CAPONE",
				"CAPTAIN", "CARLEY", "CASEY", "CASPER", "CASSIE", "CASSIS", "CHA CHA", "CHAD", "CHAMBERLAIN", "CHAMP",
				"CHANCE", "CHANEL", "CHAOS", "CHARISMA", "CHARLES", "CHARLIE", "CHARLIE BROWN", "CHARMER", "CHASE",
				"CHAUNCEY", "CHAZ", "CHECKERS", "CHELSEA", "CHEROKEE", "CHESSIE", "CHESTER", "CHEVY", "CHEWIE", "CHEWY",
				"CHEYENNE", "CHI CHI", "CHIC", "CHICO", "CHIEF", "CHILI", "CHINA", "CHIP", "CHIPPER", "CHIPPY", "CHIPS",
				"CHIQUITA", "CHIVAS", "CHLOE", "CHOCOLATE", "CHRISSY", "CHUBBS", "CHUCKY", "CHYNA", "CINDER", "CINDY",
				"CINNAMON", "CISCO", "CLAIRE", "CLANCY", "CLEO", "CLEOPATRA", "CLICKER", "CLIFFORD", "CLOVER", "CLYDE",
				"COAL", "COBWEB", "COCO", "COCOA", "COCONUT", "CODI", "CODY", "COLE", "COMET", "COMMANDO", "CONAN",
				"CONNOR", "COOKIE", "COOPER", "COPPER", "CORKY", "COSMO", "COTTON", "COZMO", "CRACKERS", "CRICKET",
				"CRYSTAL", "CUBBY", "CUBS", "CUJO", "CUPCAKE", "CURLY", "CURRY", "CUTIE", "CUTIE-PIE", "CYRUS", "DAFFY",
				"DAISEY-MAE", "DAISY", "DAKOTA", "DALLAS", "DANDY", "DANTE", "DAPHNE", "DARBY", "DARCY", "DARWIN",
				"DASH", "DAVE", "DEACON", "DEE", "DEE DEE", "DEMPSEY", "DESTINI", "DEWEY", "DEXTER", "DHARMA",
				"DIAMOND", "DICKENS", "DIEGO", "DIESEL", "DIGGER", "DILLON", "DINKY", "DINO", "DIVA", "DIXIE", "DOBIE",
				"DOC", "DODGER", "DOGGON’", "DOLLY", "DOMINO", "DOODLES", "DOOGIE", "DOTS", "DOTTIE", "DOZER",
				"DRAGSTER", "DREAMER", "DUCHESS", "DUDE", "DUDLEY", "DUFFY", "DUKE", "DUNCAN", "DUNN", "DUSTY",
				"DUTCHES", "DUTCHESS", "DYLAN", "EARL", "EBONY", "ECHO", "EDDIE", "EDDY", "EDGAR", "EDSEL", "EIFEL",
				"EINSTEIN", "ELLIE", "ELLIOT", "ELMO", "ELVIS", "ELWOOD", "EMBER", "EMILY", "EMMA", "EMMY", "ERIN",
				"ERNIE", "EVA", "FAITH", "FANCY", "FELIX", "FERGIE", "FERRIS", "FIDO", "FIFI", "FIGARO", "FINNEGAN",
				"FIONA", "FLAKE", "FLAKEY", "FLASH", "FLINT", "FLOPSY", "FLOWER", "FLOYD", "FLUFFY", "FONZIE", "FOXY",
				"FRANCAIS", "FRANKIE", "FRANKY", "FRECKLES", "FRED", "FREDDIE", "FREDDY", "FREEDOM", "FREEWAY",
				"FRESIER", "FRIDAY", "FRISCO", "FRISKY", "FRITZ", "FRODO", "FROSTY", "FURBALL", "FUZZY", "GABBY",
				"GABRIELLA", "GARFIELD", "GASBY", "GATOR", "GAVIN", "GENIE", "GEORGE", "GEORGIA", "GEORGIE", "GIANT",
				"GIBSON", "GIDGET", "GIGI", "GILBERT", "GILDA", "GINGER", "GINNY", "GIRL", "GIZMO", "GODIVA", "GOLDIE",
				"GOOBER", "GOOSE", "GORDON", "GRACE", "GRACE", "GRACIE", "GRACIE", "GRADY", "GREENIE", "GRETA",
				"GRETCHEN", "GRETEL", "GRETTA", "GRIFFEN", "GRINGO", "GRIZZLY", "GROMIT", "GROVER", "GUCCI", "GUIDO",
				"GUINNESS", "GUNNER", "GUNTHER", "GUS", "GUY", "GYPSY", "HAILEY", "HALEY", "HALLIE", "HAMLET", "HAMMER",
				"HANK", "HANNA", "HANNAH", "HANS", "HAPPYT", "HARDY", "HARLEY", "HARPO", "HARRISON", "HARRY", "HARVEY",
				"HEATHER", "HEIDI", "HENRY", "HERCULES", "HERSHEY", "HIGGINS", "HOBBES", "HOLLY", "HOMER", "HONEY",
				"HONEY-BEAR", "HOOCH", "HOOVER", "HOPE", "HOUDINI", "HOWIE", "HUDSON", "HUEY", "HUGH", "HUGO",
				"HUMPHREY", "HUNTER", "INDIA", "INDY", "IRIS", "ISABELLA", "ISABELLE", "ITSY", "ITSY-BITSY", "IVORY",
				"IVY", "IZZY", "JACK", "JACKIE", "JACKPOT", "JACKSON", "JADE", "JAGGER", "JAGS", "JAGUAR", "JAKE",
				"JAMIE", "JASMINE", "JASPER", "JAXSON", "JAZMIE", "JAZZ", "JELLY", "JELLY-BEAN", "JENNA", "JENNY",
				"JERRY", "JERSEY", "JESS", "JESSE", "JESSE JAMES", "JESSIE", "JESTER", "JET", "JETHRO", "JETT", "JETTA",
				"JEWEL", "JEWELS", "JIMMUY", "JINGLES", "JJ", "JOE", "JOEY", "JOHNNY", "JOJO", "JOKER", "JOLIE",
				"JOLLY", "JORDAN", "JOSIE", "JOY", "JR", "JUDY", "JULIUS", "JUNE", "JUNIOR", "JUSTICE", "KALI",
				"KALLIE", "KANE", "KARMA", "KASEY", "KATIE", "KATO", "KATZ", "KAYLA", "KC", "KEESHA", "KELLIE", "KELLY",
				"KELSEY", "KENYA", "KERRY", "KIBBLES", "KID", "KIKI", "KILLIAN", "KING", "KIPPER", "KIRA", "KIRBY",
				"KISMET", "KISSY", "KITTY", "KIWI", "KLAUS", "KOBA", "KOBE", "KODA", "KOKO", "KONA", "KOSMO", "KOTY",
				"KRAMER", "KUJO", "KURLY", "KYRA", "LACEY", "LADDIE", "LADY", "LADYBUG", "LANEY", "LASSIE", "LATTE",
				"LAYLA", "LAZARUS", "LEFTY", "LEO", "LEVI", "LEXI", "LEXIE", "LEXUS", "LIBBY", "LIGHTNING", "LILI",
				"LILLY", "LILY", "LINCOLN", "LINUS", "LITTLE BIT", "LITTLE-GUY", "LITTLE-ONE", "LITTLE-RASCAL", "LIZZY",
				"LOGAN", "LOKI", "LOLA", "LOU", "LOUIE", "LOUIS", "LOVEY", "LUCAS", "LUCI", "LUCIFER", "LUCKY", "LUCY",
				"LUKE", "LULU", "LUNA", "LYNX", "MAC", "MACHO", "MACINTOSH", "MACK", "MACKENZIE", "MACY", "MADDIE",
				"MADDY", "MADISON", "MAGGIE", "MAGGIE-MAE", "MAGGIE-MOO", "MAGGY", "MAGIC", "MAGNOLIA", "MAJOR",
				"MANDI", "MANDY", "MANGO", "MARBLE", "MARIAH", "MARLEY", "MARY", "MARY JANE", "MASON", "MATTIE",
				"MAVERICK", "MAX", "MAXIMUS", "MAXINE", "MAXWELL", "MAY", "MAYA", "MCDUFF", "MCKENZIE", "MEADOW",
				"MEGAN", "MEGGIE", "MERCEDES", "MERCLE", "MERLIN", "MIA", "MIASY", "MICHAEL", "MICKEY", "MIDNIGHT",
				"MIKEY", "MIKO", "MILES", "MILLER", "MILLIE", "MILO", "MIMI", "MINDY", "MING", "MINI", "MINNIE",
				"MISCHIEF", "MISHA", "MISS KITTY", "MISS PRISS", "MISSIE", "MISSY", "MISTER", "MISTY", "MITCH",
				"MITTENS", "MITZI", "MITZY", "MO", "MOCHA", "MOJO", "MOLLIE", "MOLLY", "MONA", "MONKEY", "MONSTER",
				"MONTANA", "MONTGOMERY", "MONTY", "MOOCHER", "MOOCHIE", "MOOKIE", "MOONSHINE", "MOOSE", "MORGAN",
				"MOSES", "MOUSE", "MR KITTY", "MUFFIN", "MUFFY", "MUGSY", "MULLIGAN", "MUNCHKIN", "MURPHY", "NAKITA",
				"NALA", "NANA", "NAPOLEON", "NATASHA", "NATHAN", "NELLIE", "NEMO", "NENA", "NERO", "NESTLE", "NEWT",
				"NEWTON", "NIBBLES", "NIBBY", "NIBBY-NOSE", "NICK", "NICKERS", "NICKIE", "NICKY", "NICO", "NIKE",
				"NIKI", "NIKITA", "NIKKI", "NIKO", "NINA", "NITRO", "NOBEL", "NOEL", "NONA", "NOODLES", "NORTON",
				"NOSEY", "NUGGET", "NUTMEG", "OAKLEY", "OBIE", "ODIE", "OLD GLORY", "OLIVE", "OLIVER", "OLIVIA",
				"OLLIE", "ONIE", "ONYX", "OPIE", "OREO", "OSCAR", "OTIS", "OTTO", "OZ", "OZZIE", "OZZY", "PABLO",
				"PACO", "PADDINGTON", "PADDY", "PANDA", "PANDORA", "PANTHER", "PAPA", "PARIS", "PARKER", "PASHA",
				"PATCH", "PATCHES", "PATRICKY", "PATSY", "PATTY", "PEACHES", "PEANUT", "PEANUTS", "PEARL", "PEBBLES",
				"PEDRO", "PENNY", "PEPE", "PEPPER", "PEPPY", "PEPSI", "PERSY", "PETE", "PETER", "PETEY", "PETIE",
				"PHANTOM", "PHOEBE", "PHOENIX", "PICASSO", "PICKLES", "PIERRE", "PIGGY", "PIGLET", "PINK PANTHER",
				"PINKY", "PINTO", "PIPER", "PIPPIN", "PIPPY", "PIP-SQUEEK", "PIRATE", "PIXIE", "PLATO", "PLUTO",
				"POCKETS", "POGO", "POKEY", "POLLY", "PONCHO", "PONGO", "POOCH", "POOCHIE", "POOH", "POOH-BEAR",
				"POOKIE", "POOKY", "POPCORN", "POPPY", "PORCHE", "PORKCHOP", "PORKY", "PORTER", "POWDER", "PRANCER",
				"PRECIOUS", "PRESLEY", "PRETTY", "PRETTY-GIRL", "PRINCE", "PRINCESS", "PRISSY", "PUCK", "PUDDLES",
				"PUDGE", "PUFFY", "PUGSLEY", "PUMPKIN", "PUNKIN", "PUPPY", "PURDY", "QUEEN", "QUEENIE", "QUINCY",
				"QUINN", "RAGS", "RAISON", "RALPH", "RALPHIE", "RAMBLER", "RAMBO", "RANGER", "RASCAL", "RAVEN", "REBEL",
				"RED", "REGGIE", "REILLY", "REMY", "REX", "REXY", "RHETT", "RICKY", "RICO", "RIGGS", "RILEY",
				"RIN TIN TIN", "RINGO", "RIPLEY", "ROCCO", "ROCK", "ROCKET", "ROCKO", "ROCKY", "ROLAND", "ROLEX",
				"ROLLIE", "ROMAN", "ROMEO", "ROSA", "ROSCOE", "ROSEBUD", "ROSIE", "ROSY", "ROVER", "ROWDY", "ROXANNE",
				"ROXIE", "ROXY", "RUBY", "RUCHUS", "RUDY", "RUFFE", "RUFFER", "RUFFLES", "RUFUS", "RUGER", "RUSTY",
				"RUTHIE", "RYDER", "SABINE", "SABLE", "SABRINA", "SADIE", "SAGE", "SAILOR", "SALEM", "SALLY", "SALTY",
				"SAM", "SAMANTHA", "SAMMY", "SAMPSON", "SAMSON", "SANDY", "SARA", "SARAH", "SARGE", "SASHA", "SASSIE",
				"SASSY", "SAVANNAH", "SAWYER", "SCARLETT", "SCHOTZIE", "SCHULTZ", "SCOOBIE", "SCOOBY", "SCOOBY-DOO",
				"SCOOTER", "SCOTTIE", "SCOUT", "SCRAPPY", "SCRUFFY", "SEBASTIAN", "SHADOW", "SHADY", "SHAGGY", "SHASTA",
				"SHEBA", "SHEENA", "SHELBY", "SHELLY", "SHERMAN", "SHILOH", "SHINER", "SHORTY", "SIENNA", "SIERRA",
				"SILKY", "SILVER", "SILVESTER", "SIMBA", "SIMON", "SIMONE", "SISSY", "SKEETER", "SKINNY", "SKIP",
				"SKIPPER", "SKIPPY", "SKITTLES", "SKY", "SKYE", "SKYLER", "SLICK", "SLINKY", "SLY", "SMARTY", "SMOKE",
				"SMOKEY", };

		Random ran = new Random();

		// pick a Pet Name based on length of array
		String name = petName[ran.nextInt(petName.length)];

		// Return the Name, and Fix the name to left just the First Letter in Capital
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

	}

	// Function to read CSV file and generate the Animals names
	// Medical Condition and Kind of animal
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}

		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		return data;
	}

	// Function to generate Animals
	public static void startAnimals() {
		// List of Animals
		List<Animal> animals = new LinkedList<Animal>();

		// Read a CSV file then create new animals based on that data

		// Set the PATH and name of the File
		String file = "animalsData.csv";

		List<String[]> newAnimals = Helper.read(file);
		for (String[] animal : newAnimals) {
			// Calling the function to modify the name passing the name on position 0 of my
			// List
			String name = nameToLowerCase(animal[0]);
			int age = generateAge();
			String medicalCondition = animal[1];
			String animalKind = animal[2];

			if (animalKind.equals("Dog")) {
				animals.add(new Dog(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Cat")) {
				animals.add(new Cat(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Rabbit")) {
				animals.add(new Rabbit(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Horse")) {
				animals.add(new Horse(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Bird")) {
				animals.add(new Bird(name, age, medicalCondition, animalKind));
			} else {
				System.out.println("ERROR READING ANIMAL KIND");
			}
		}

		showAnimals(animals);
	}

	// Function to generate Staff
	public static void startStaff() {
		System.out.println("STAFF MEMBERS ADDED");

	}

	// Function to Fix Names
	/*
	 * I have a List with all names in UPPERCASE so to make the program to looks
	 * better i wrote this method to convert the rest of the name in LOWERCASE
	 */
	public static String nameToLowerCase(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}

	// Function to Generate Age and do not give a age == 0
	public static int generateAge() {
		int age = 0;
		while (age == 0) {
			age = (int) (Math.random() * Math.pow(10, 1));
		}
		return age;

	}

	// Function to show Animals
	public static List<String[]> showAnimals(List<Animal> animals) {
		for (Animal anim : animals) {
			System.out.println("\n----------------------------------------------------");
			anim.showInfo();

			// Delete latter, just to check the List size
			System.out.println("Number of Animals: " + animals.size());
		}
		return null;
	}

}
