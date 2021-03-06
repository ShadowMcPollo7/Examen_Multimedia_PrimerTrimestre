package com.example.examen_primertri;

import android.widget.GridLayout;

public class JugadaAleatoria implements AndroidJugada {
    private boolean disponible = false;
    private int pos;

    @Override
    public int play(GridLayout tablero) {
        for (int i = 0; i < 9; i++) {
            if (tablero.getChildAt(i).isClickable()) {
                while (!disponible) {
                    pos = (int) (Math.random() * 9);
                    if (tablero.getChildAt(pos).isClickable()) {
                        disponible = true;
                    }

                }
                if (disponible) return pos;

            }
        }
        return -1;
    }
}
