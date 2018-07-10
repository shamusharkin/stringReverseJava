public class Bus {
    private int capacity;
    private int vacancies;
    private int fare;
    private String[] passengers;

    public Bus(int capacity) {
        this.capacity = capacity;
        vacancies = capacity;
        passengers = new String[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int Vacancies() {
        return vacancies;
    }

    public void board(Passenger passenger, int fare) {
        this.fare += fare;
        vacancies--;
        passengers[(capacity - vacancies) -1] = passenger.getName() + " (" + passenger.getId() + ")";
    }

    public Object[] passengerNames() {
        return passengers;
    }


    public void switchSeats(Passenger passenger1, Passenger passenger2) {

        int indexPassenger1 = 0;
        int indexPassenger2 = 0;
        for (int i=0; i < passengers.length; i++) {
            System.out.println(i);
            if(passengers[i].contains(passenger1.getName())) {
                indexPassenger1 = i;
            }
            if(passengers[i].contains(passenger2.getName())) {
                indexPassenger2 = i;
            }
        }

        String[] tempArray = new String[capacity];
        for(int i=0; i < tempArray.length; i++){
            tempArray[i] = passengers[i];
        }

        passengers[indexPassenger1] = tempArray[indexPassenger2];
        passengers[indexPassenger2] = tempArray[indexPassenger1];

    }

    public int paidFares() {
        return fare;
    }
}
