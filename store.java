
public class store {
	

		Wardrobes Wardrobe;


    public Wardrobes CreateWardrobe(String name){
        if(name=="Real_wood")
        {
            Wardrobe = (Wardrobes) new Real_wood();
        }
        else if(name=="Metal")
        {
            Wardrobe = (Wardrobes) new Metal();
        }
        else if(name=="Compressed_Wood"){
            Wardrobe =  (Wardrobes) new Compressed_Wood();
        }
        
        return Wardrobe;
    }
  
    
}



