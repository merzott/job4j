package ru.job4j.tictactoe;

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

    /**
     * Method "isWinnerX" detects if X is winner.
     * @return true if X is winner
     */
    public boolean isWinnerX() {
        boolean result = false;
        boolean isEqual = true;

        for (int index = 0; index < table.length; index++) {
            if (!table[index][index].hasMarkX()) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            result = true;
        } else {
            isEqual = true;
        }

        for (int index = 0; index < table.length; index++) {
            if (!table[index][table.length - 1 - index].hasMarkX()) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            result = true;
        } else {
            isEqual = true;
        }

        for (int column = 0; column < table.length; column++) {
            for (int row = 0; row < table.length; row++) {
                if (!table[row][column].hasMarkX()) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                result = true;
            } else {
                isEqual = true;
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                if (!table[row][column].hasMarkX()) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                result = true;
            } else {
                isEqual = true;
            }
        }

        return result;
    }


    public boolean isWinnerO() {
        boolean result = false;
        boolean isEqual = true;

        for (int index = 0; index < table.length; index++) {
            if (!table[index][index].hasMarkO()) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            result = true;
        } else {
            isEqual = true;
        }

        for (int index = 0; index < table.length; index++) {
            if (!table[index][table.length - 1 - index].hasMarkO()) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            result = true;
        } else {
            isEqual = true;
        }

        for (int column = 0; column < table.length; column++) {
            for (int row = 0; row < table.length; row++) {
                if (!table[row][column].hasMarkO()) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                result = true;
            } else {
                isEqual = true;
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                if (!table[row][column].hasMarkO()) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                result = true;
            } else {
                isEqual = true;
            }
        }

        return result;
    }

    public boolean hasGap() {
        boolean result = false;

        LOOP_ROW:
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                if (!(table[row][column].hasMarkX() || table[row][column].hasMarkO())) {
                    result = true;
                    break LOOP_ROW;
                }
            }
        }

        return result;
    }
}
