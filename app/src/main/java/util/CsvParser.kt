package util

import data.domain.Match

class CsvParser {
    fun parse(line:String):Match{
        val tokens=line.split(",")

        return Match(
            matchDate = tokens[Constants.ColumnIndex.DATE],
            homeTeam = tokens[Constants.ColumnIndex.homeTeam],
            awayTeam = tokens[Constants.ColumnIndex.awayTeam],
            homTeamResult = tokens[Constants.ColumnIndex.homeTeamResult],
            awayTeamResult = tokens[Constants.ColumnIndex.awayTeamResult],
            homeTeamShots = tokens[Constants.ColumnIndex.homeTeamShots],
            awayTeamShots = tokens[Constants.ColumnIndex.awayTeamShots],
            homeTeamShotsOnTarget = tokens[Constants.ColumnIndex.homeTeamShotsOnTarget],
            awayTeamShotsOnTarget = tokens[Constants.ColumnIndex.awayTeamShotsOnTarget],
            homeTeamFouls = tokens[Constants.ColumnIndex.homeTeamFouls],
            awayTeamFouls = tokens[Constants.ColumnIndex.awayTeamFouls],
            homeTeamCorners = tokens[Constants.ColumnIndex.homeTeamCorners],
            awayTeamCorners = tokens[Constants.ColumnIndex.awayTeamCorners],
            homeTeamYellowCards = tokens[Constants.ColumnIndex.homeTeamYellowCards],
            awayTeamYellowCards = tokens[Constants.ColumnIndex.awayTeamYellowCards],
            homeTeamRedCards = tokens[Constants.ColumnIndex.homeTeamRedCards],
            awayTeamRedCards = tokens[Constants.ColumnIndex.awayTeamRedCards],
            referee = tokens[Constants.ColumnIndex.Referee]
        )

    }
}