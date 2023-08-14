package data.domain

data class Match(
    val matchDate:String,
    val homeTeam:String,
    val awayTeam:String,
    val homTeamResult:String,
    val awayTeamResult:String,
    val homeTeamShots:String,
    val awayTeamShots:String,
    val homeTeamShotsOnTarget: String,
    val awayTeamShotsOnTarget: String,
    val homeTeamFouls:String,
    val awayTeamFouls: String,
    val homeTeamCorners:String,
    val awayTeamCorners: String,
    val homeTeamYellowCards:String,
    val awayTeamYellowCards:String,
    val homeTeamRedCards:String,
    val awayTeamRedCards:String,
    val referee:String
)
