interface travelbooking {
    public void bookticket();
}

class agent implements travelbooking {
    public travelbooking t;

    public agent(travelbooking t) {
        this.t = t;
    }

    public void bookticket() {
        t.bookticket();
    }
}

class train implements travelbooking {
    public void bookticket() {
        System.out.println("train booked");
    }
}

class plane implements travelbooking {
    public void bookticket() {
        System.out.println("plane booked");
    }
}

class Main {
    public static void main(String[] args) {
        agent a = new agent(new train());
        a.bookticket();
    }
}