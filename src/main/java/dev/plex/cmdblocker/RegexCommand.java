package dev.plex.cmdblocker;

import dev.plex.rank.enums.Rank;
import lombok.Getter;

import java.util.regex.Pattern;

@Getter
public class RegexCommand extends BaseCommand
{
    private final Pattern regex;

    public RegexCommand(Pattern r1, Rank r2, String m1)
    {
        super(r2, m1);
        regex = r1;
    }

    public String toString()
    {
        return "RegexCommand (Rank: " + getRank().name() + ", Regex: " + regex.toString() + ", Message: " + getMessage() + ")";
    }
}