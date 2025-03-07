
public class Benutzer {

    private record User(int uid, String kennung, String passwort, String fullname) {
    }

    public static void main(String[] args) {

        User[] users = new User[5];
        users[0] = new User(77, "bb2iszu", "QHDJNGSJDGN", "Bert Lockhardt");
        users[1] = new User(77, "bb2isab", "JKAZ33rNJNH", "Dolores Jane Umbridge");
        users[2] = new User(66, "bb2iscd", "KNDFJNJNDGF", "Allister Moody");
        users[3] = new User(22, "bb2isgh", "DFJRTJUEJTZ", "Pamona Sprout");
        users[4] = new User(22, "bb2isgh", "DHLUTGNHFGR", "Minerva McGonagall");

        for (int i = 0; i < users.length - 1; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].uid > users[j].uid) {
                    User hold = users[i];
                    users[i] = users[j];
                    users[j] = hold;
                } else if (users[i].kennung.compareTo(users[j].kennung) > 0) {
                    User hold = users[i];
                    users[i] = users[j];
                    users[j] = hold;
                } else if (users[i].fullname.compareTo(users[j].fullname) > 0) {
                    User hold = users[i];
                    users[i] = users[j];
                    users[j] = hold;
                }
            }
        }

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].fullname);
        }
    }
}
