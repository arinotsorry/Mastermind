public record Comparators() {
    /**
     * Storage for all cards - take a random sampling of up to six of these per game
     *
     * Possible symbols for digits: △/□/◯/◇/☆/⋂/⌂/⌇/⌴/⎔/▣/▯/☐/☍/☖/☼/♡/♢/♤/♧/⛉/✳/✽/✿/❀
     * My favorites: △/□/◯/◇/☆
     */

    static String[] descriptions = {
            "Is the %c digit %c %d?", // Is the ()
            ""
    };
}
