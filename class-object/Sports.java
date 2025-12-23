interface Sport {
    public void hometeam(String name);
    public void awayteam(String name);
}

interface football extends Sport {
    public void hometeamscore(int points);
    public void awayteamscore(int points);
    public void quaterTime(int quater);
}

interface volleyball extends Sport {
    public void hometeampoint(int point);
    public void awayteampoint(int point);
    public void SetPlay(int sets);
}

 class volleyballdemo implements volleyball {

    public void hometeam(String name) {
        System.out.println("Home team: " + name);
    }

    public void awayteam(String name) {
        System.out.println("Away team: " + name);
    }

    public void hometeampoint(int point) {
        System.out.println("Home team points: " + point);
    }

    public void awayteampoint(int point) {
        System.out.println("Away team points: " + point);
    }

    public void SetPlay(int sets) {
        System.out.println("Sets played: " + sets);
    }

    public static void main(String[] args) {
        volleyball v = new volleyballdemo();
        v.hometeam("Nepal");
        v.awayteam("India");
        v.hometeampoint(25);
        v.awayteampoint(22);
        v.SetPlay(3);
    }
}
