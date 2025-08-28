package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlaces;
import pojo.Location;

public class TestDataBuild {
	
	
	public AddPlaces addPlacePayload(String Name, String Language, String Address) {
		
		
		AddPlaces p= new AddPlaces();
		p.setAccuracy(50);
		p.setAddress(Address);
		p.setLanguage(Language);
	    p.setPhone_number("(+91) 983 893 3937");
	    p.setWebsite("http://google.com");
	    p.setName(Name);

	    List<String> myList = new ArrayList<>();
	    myList.add("shoe park");
	    myList.add("shop");
	    p.setType(myList);

	    Location l = new Location();
	    l.setLat(-38.383494);
	    l.setLng(33.427362);
		p.setLocation(l);
		return p;
	}

	public String deletePlacePayload(String  place_Id) {
		
		return  "{\r\n\"place_id\":\""+place_Id+"\"\r\n}";
		
		
	}
}
