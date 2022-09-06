public class ManagerFilm {
    private String[] films = new String[0];
    private int limit;
    public ManagerFilm() {
        this.limit = 10;

    }

    public ManagerFilm(int limit) {
        this.limit = limit;

    }
    public String[] addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length -1] = film;
        films = tmp;
        return tmp;
    }

    public String[] showAll() {

        return films;

    }

    public String[] showLast() {
        int sizeLength;
        if (limit <= films.length) {
            sizeLength = limit;
        }else  {
            sizeLength = films.length;
        }
        String[] tmp = new String[limit];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
   }


}
