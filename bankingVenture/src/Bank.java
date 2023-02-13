abstract class Bank{
    
    private Agency agencies[];

    public Bank(Agency[] agencies) {
        this.agencies = agencies;
    }
  
    
    public Agency[] getAgencies() {
        return agencies;
    }


    public void setAgencies(Agency[] agencies) {
        this.agencies = agencies;
    }

    public void checkAgency(Agency[] agencies, String county){
    
        for (int i = 0; i <= agencies.length; i++) {
            Address address = agencies[i].getAddress();
            String agency = address.getCounty();
            if(county == agency){
                System.out.println("Existe uma agência nesse múnicipio!");
            }else{
                System.out.println("Não foi encontrado nenhuma agencia no nosso sistema nesse múnicipio, para iniciar um novo empreendimento entre em contato:(XX)XXXXX-XXXX");
            }
        }
    } 
    public void showAgencies ( Agency[] agencies){
        for( int i = 0; i< agencies.length; i++){
            String name = agencies[i].getName();
            Address address = agencies[i].getAddress();
            String county = address.getCounty();
            System.out.println("Nome: "+ name+" Municipio:"+county);
        }
    }



}

