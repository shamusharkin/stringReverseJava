import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    @Test
    public void InitialBusCapacity() {
        assertEquals(12, new Bus(12).getCapacity());
        assertEquals(20, new Bus(20).getCapacity());

    }

    @Test
    public void BusVacanciesEqualToBusCapacity(){
        assertEquals(12, new Bus(12).Vacancies());
        assertEquals(20, new Bus(20).Vacancies());
    }

    @Test
    public void AllowsYouToBoardAPassengerWithAPaidFare(){
        //create 2 passengers
        Passenger joe = new Passenger(1, "Joe Jones");
        Passenger sue = new Passenger(2, "Sue Summers");

        //create a bus
        Bus whiteBus = new Bus(10);

        //add passenger and fare amount to Bus
        whiteBus.board(joe,4);
        //expect vacancies to be one less than capacity
        assertEquals(9, whiteBus.Vacancies());

        whiteBus.board(sue, 3);
        assertEquals(8, whiteBus.Vacancies());
        assertEquals(10, whiteBus.getCapacity());

    }

    @Test
    public void AllowsYouToSeeFullNamesOfPassengerNamesInTheOrderTheyWereAdded(){


        Passenger joe = new Passenger(1, "Joe Jones");
        Passenger sue = new Passenger(2, "Sue Summers");

        Bus whiteBus = new Bus(5);

        String expectedResult[] = new String [5];
        Assert.assertArrayEquals(expectedResult, whiteBus.passengerNames());

        whiteBus.board(joe, 4);
        String UpdatedExpectedResult[] = new String [5];
        UpdatedExpectedResult[0] = "Joe Jones (1)";
        Assert.assertArrayEquals(UpdatedExpectedResult, whiteBus.passengerNames());


        whiteBus.board(sue, 2);
        String UpdatedExpectedResult2[] = new String [5];
        UpdatedExpectedResult2[0] = "Joe Jones (1)";
        UpdatedExpectedResult2[1] = "Sue Summers (2)";

        Assert.assertArrayEquals(UpdatedExpectedResult2, whiteBus.passengerNames());
    }

    @Test
    public void AllowsPassengersToSwitchSeats(){

        Passenger joe = new Passenger(1, "Joe Jones");
        Passenger kat = new Passenger(4, "Kat Kaplan");
        Passenger sue = new Passenger(3, "Sue Summers");
        Passenger yas = new Passenger(2, "Yasamine Yarrow");

        Bus whiteBus = new Bus(4);
        whiteBus.board(joe, 3);
        whiteBus.board(kat, 4);
        whiteBus.board(sue, 4);
        whiteBus.board(yas, 5);

        whiteBus.switchSeats(joe, sue);

        String expectedResult[] = new String [4];
        expectedResult[0] = "Sue Summers (3)";
        expectedResult[1] = "Kat Kaplan (4)";
        expectedResult[2] = "Joe Jones (1)";
        expectedResult[3] = "Yasamine Yarrow (2)";

        Assert.assertArrayEquals(expectedResult, whiteBus.passengerNames());

        whiteBus.switchSeats(kat, joe);

        String updatedExpectedResult[] = new String [4];
        updatedExpectedResult[0] = "Sue Summers (3)";
        updatedExpectedResult[1] = "Joe Jones (1)";
        updatedExpectedResult[2] = "Kat Kaplan (4)";
        updatedExpectedResult[3] = "Yasamine Yarrow (2)";

        Assert.assertArrayEquals(updatedExpectedResult, whiteBus.passengerNames());

    }
//
    @Test
    public void AllowsYouToGetTheTotalOfAllPaidFares() {

        Bus whiteBus = new Bus(10);
        Passenger joe = new Passenger(1, "Joe Jones");
        Passenger sue = new Passenger(2, "Sue Summers");
        Passenger sally = new Passenger(3, "Sally Sue");

        whiteBus.board(joe, 4);
        assertEquals(4, whiteBus.paidFares());

        whiteBus.board(sue, 3);
        assertEquals(7, whiteBus.paidFares());

        whiteBus.board(sally, 3);
        assertEquals(10, whiteBus.paidFares());

    }
}
