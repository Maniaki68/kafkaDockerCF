public class Person {
    String name;
    String firstname;
    String telephonenumber;
    String adresse;

    public Person(){
        this.name = null;
        this.firstname = null;
        this.telephonenumber = null;
        this.adresse = null;
    }

    public Person(String name,String firstname,String telephonenumber,String adresse){
        this.name = name;
        this.firstname = firstname;
        this.telephonenumber = telephonenumber;
        this.adresse = adresse;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTelephonenumber(String telephonenumber){
        this.telephonenumber = telephonenumber;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getName(){
        return this.name;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getTelephonenumber(){
        return this.telephonenumber;
    }
    public String getAdresse(){
        return this.adresse;
    }

    public void ToString(){
            System.out.println(
                    "Person name : "+ this.name +
                            " ,Person FirstName : " + this.firstname +
                                " ,Person number : " + this.telephonenumber+
                                    " ,Person address : " + this.adresse
            ); 
    }
}
