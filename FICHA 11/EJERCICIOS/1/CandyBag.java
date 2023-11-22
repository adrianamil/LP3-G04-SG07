import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CandyBag<T extends Goodie> extends Bag<T> {
    public void add(T goodie) {
        if (!getItems().contains(goodie)) {
            super.add(goodie);
        }
    }

    public T barato() {
        if (getItems().isEmpty()) {
            return null;
        }

        T caroGoodie = getItems().get(0);
        for (T goodie : getItems()) {
            if (goodie.getPrecio() < caroGoodie.getPrecio()) {
                caroGoodie = goodie;
            }
        }
        return caroGoodie;
    }

    public CandyBag<T> masCara(int n) {
        if (getItems().isEmpty()) {
            return null;
        }

        List<T> sortedList = new ArrayList<>(getItems());
        sortedList.sort(Comparator.comparingDouble(Goodie::getPrecio).reversed());

        CandyBag<T> masCaraBag = new CandyBag<>();
        for (int i = 0; i < Math.min(n, sortedList.size()); i++) {
            masCaraBag.add(sortedList.get(i));
        }

        return masCaraBag;
    }
}
