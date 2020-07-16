package _05_Enum_Stuff;

import javax.swing.JOptionPane;


public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	enum Zodiac {
		ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
		LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES

	}
	public static void main(String[] args) {
		Zodiac z = Zodiac.TAURUS;
		_00_Horoscope h = new _00_Horoscope();
		h.run(z);
		
	}
	void run(Zodiac z) {
		switch(z) {
		case ARIES:{
		JOptionPane.showMessageDialog(null, "You are feeling cool!");
		break;
		}
		case TAURUS:{
		JOptionPane.showMessageDialog(null, "You are feeling cold!");	
		break;
		}
		case GEMINI:{
		JOptionPane.showMessageDialog(null, "You are feeling hot!");
		break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "You are feeling like you have cancer!");	
			break;
			}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You are feeling very sleepy!");	
			break;
			}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "You are feeling visco!");	
			break;
			}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "You are feeling like a zebra!");
			break;
			}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You are feeling like a scorpian!");	
			break;
			}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You are feeling like a big word that I don't know!");
			break;
			}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You are feeling like a lepricon!");	
			break;
			}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You are feeling watery!");	
			break;
			}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "You are feeling like your mom! oOOOOOOOOOOO");	
			break;
			}
		default: 
			JOptionPane.showMessageDialog(null, "ERROR!");
			break;
		}
	}

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	
}
