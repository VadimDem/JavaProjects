package Alpinism;

class ClimbingGroup {
    private boolean recruitment;
    private Alpinist[] alpinist;
    private Mountain mountain;

    public ClimbingGroup(Mountain mountain, int groupSize) {
        this.recruitment = false;
        this.alpinist = new alpinist[groupSize];
        this.mountain = mountain;
    }

    public void openRecruitment() {
        recruitment = true;
    }

    public void closeRecruitment() {
        recruitment = false;
    }

}

