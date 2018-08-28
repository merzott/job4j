package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * Class "Logic3T" contains logic for "TicTacToe" class
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }


    /**
     * Method "isWinnerX" detects if X is winner.
     * @return true if X is winner
     */
    public boolean isWinnerX() {
        boolean result = false;
        result  |= this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 1);
        result  |= this.fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1);
        for (int i = 0; i < this.table.length; i++) {
            result  |=  this.fillBy(Figure3T::hasMarkX, 0, i, 1, 0);
        }
        for (int i = 0; i < this.table[0].length; i++) {
            result  |=  this.fillBy(Figure3T::hasMarkX, i, 0, 0, 1);
        }
        return result;
    }

    /**
     * Method "isWinnerO" detects if O is winner.
     * @return true if X is winner
     */
    public boolean isWinnerO() {
        boolean result = false;
        result  |= this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 1);
        result  |= this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1);
        for (int i = 0; i < this.table.length; i++) {
            result  |=  this.fillBy(Figure3T::hasMarkO, 0, i, 1, 0);
        }
        for (int i = 0; i < this.table[0].length; i++) {
            result  |=  this.fillBy(Figure3T::hasMarkO, i, 0, 0, 1);
        }
        return result;
    }


    /**
     * Method "hasGap" detects if there are free cells.
     * @return true if there is one free cell at least
     */
    public boolean hasGap() {
        boolean result = false;

        for (int row = 0; row < table.length && !result; row++) {
            for (int column = 0; column < table.length; column++) {
                if (!(table[row][column].hasMarkX() || table[row][column].hasMarkO())) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
