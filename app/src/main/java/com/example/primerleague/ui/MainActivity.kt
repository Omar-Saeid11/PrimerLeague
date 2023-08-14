package com.example.primerleague.ui

import android.view.LayoutInflater
import com.example.primerleague.R
import com.example.primerleague.databinding.ActivityMainBinding
import data.DataManager
import data.domain.Match
import util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG=LOGTAG
    override var bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun callBacks() {
        bindingV.apply {
            next.setOnClickListener {
                bindMatch(DataManager.getNextMatch())
            }
            prev.setOnClickListener {
                bindMatch(DataManager.getPrevMatch())
            }

        }
    }

    override fun parseFile() {
        val inputStream=assets.open(FILE_NAME)
        val buffer=BufferedReader(InputStreamReader(inputStream))
        val parser=CsvParser()
        buffer.forEachLine {
            val currentMatch=parser.parse(it)
            DataManager.addMatch(currentMatch)
        }
        bindMatch(DataManager.getCurrentMatch())
    }

//    search_view.setOnQueryTextListener( object : SearchView.OnQueryTextListener{
//         fun onQueryTextSubmit(p0: String?): Boolean {
//            return true
//        }
    private fun bindMatch(match: Match) {
        bindingV.apply {
            date.text=match.matchDate
            homeTeam.text=match.homeTeam
            awayTeam.text=match.awayTeam
            resultHomeTeam.text=match.homTeamResult
            resultAwayTeam.text=match.awayTeamResult
            ref.text=match.referee
            homeTeamGoals.text=match.homTeamResult
            awayTeamGoals.text=match.awayTeamResult
            homeTeamShots.text=match.homeTeamShots
            awayTeamShots.text=match.awayTeamShots
            homeTeamShotsOnTarget.text=match.homeTeamShotsOnTarget
            awayTeamShotsOnTarget.text=match.awayTeamShotsOnTarget
            homeCorners.text=match.homeTeamCorners
            awayCorners.text=match.awayTeamCorners
            homeFreeKicks.text=match.homeTeamFouls
            awayFreeKicks.text=match.awayTeamFouls
            homeYellowCards.text=match.homeTeamYellowCards
            awayYellowCards.text=match.awayTeamYellowCards
            homeRedCards.text=match.homeTeamRedCards
            awayRedCards.text=match.awayTeamRedCards
            when (match.homeTeam) {
                "Arsenal" -> {
                    homeTeamLogo.setImageResource(R.drawable.arsenal)
                }
                "Bournemouth" -> {
                    homeTeamLogo.setImageResource(R.drawable.bournomoth)
                }
                "Man United" -> {
                    homeTeamLogo.setImageResource(R.drawable.man_united)
                }
                "Fulham" -> {
                    homeTeamLogo.setImageResource(R.drawable.fulham)
                }
                "Huddersfield" ->{
                    homeTeamLogo.setImageResource(R.drawable.huddersfild)
                }
                "Newcastle" -> {
                    homeTeamLogo.setImageResource(R.drawable.newcastle)
                }
                "Watford" ->{
                    homeTeamLogo.setImageResource(R.drawable.watford)
                }
                "Wolves" ->{
                    homeTeamLogo.setImageResource(R.drawable.wolvs)
                }
                "Liverpool" ->{
                    homeTeamLogo.setImageResource(R.drawable.reds)
                }
                "Southampton" ->{
                    homeTeamLogo.setImageResource(R.drawable.southampton)
                }
                "Cardiff" ->{
                    homeTeamLogo.setImageResource(R.drawable.cardif)
                }
                "Chelsea" ->{
                    homeTeamLogo.setImageResource(R.drawable.chelsea)
                }
                "Everton" ->{
                    homeTeamLogo.setImageResource(R.drawable.everton)
                }
                "Leicester" ->{
                    homeTeamLogo.setImageResource(R.drawable.lister)
                }
                "Tottenham" ->{
                    homeTeamLogo.setImageResource(R.drawable.spirs)
                }
                "West Ham" ->{
                    homeTeamLogo.setImageResource(R.drawable.westham)
                }
                "Brighton" ->{
                    homeTeamLogo.setImageResource(R.drawable.brighton)
                }
                "Burnley" ->{
                    homeTeamLogo.setImageResource(R.drawable.burnly)
                }
                "Man City" ->{
                    homeTeamLogo.setImageResource(R.drawable.man_city)
                }
                "Crystal Palace" ->{
                    homeTeamLogo.setImageResource(R.drawable.crystal_palace)
                }
                else -> {
                    homeTeamLogo.setImageResource(com.google.android.material.R.drawable.navigation_empty_icon)
                }
            }
            when (match.awayTeam) {
                "Arsenal" -> {
                    awayTeamLogo.setImageResource(R.drawable.arsenal)
                }
                "Bournemouth" -> {
                    awayTeamLogo.setImageResource(R.drawable.bournomoth)
                }
                "Man United" -> {
                    awayTeamLogo.setImageResource(R.drawable.man_united)
                }
                "Fulham" -> {
                    awayTeamLogo.setImageResource(R.drawable.fulham)
                }
                "Huddersfield" ->{
                    awayTeamLogo.setImageResource(R.drawable.huddersfild)
                }
                "Newcastle" -> {
                    awayTeamLogo.setImageResource(R.drawable.newcastle)
                }
                "Watford" ->{
                    awayTeamLogo.setImageResource(R.drawable.watford)
                }
                "Wolves" ->{
                    awayTeamLogo.setImageResource(R.drawable.wolvs)
                }
                "Liverpool" ->{
                    awayTeamLogo.setImageResource(R.drawable.reds)
                }
                "Southampton" ->{
                    awayTeamLogo.setImageResource(R.drawable.southampton)
                }
                "Cardiff" ->{
                    awayTeamLogo.setImageResource(R.drawable.cardif)
                }
                "Chelsea" ->{
                    awayTeamLogo.setImageResource(R.drawable.chelsea)
                }
                "Everton" ->{
                    awayTeamLogo.setImageResource(R.drawable.everton)
                }
                "Leicester" ->{
                    awayTeamLogo.setImageResource(R.drawable.lister)
                }
                "Tottenham" ->{
                    awayTeamLogo.setImageResource(R.drawable.spirs)
                }
                "West Ham" ->{
                    awayTeamLogo.setImageResource(R.drawable.westham)
                }
                "Brighton" ->{
                    awayTeamLogo.setImageResource(R.drawable.brighton)
                }
                "Burnley" ->{
                    awayTeamLogo.setImageResource(R.drawable.burnly)
                }
                "Man City" ->{
                    awayTeamLogo.setImageResource(R.drawable.man_city)
                }
                "Crystal Palace" ->{
                    awayTeamLogo.setImageResource(R.drawable.crystal_palace)
                }
                else -> {
                    awayTeamLogo.setImageResource(com.google.android.material.R.drawable.navigation_empty_icon)
                }
            }
        }
    }
    companion object{
        const val LOGTAG="MAIN_ACTIVITY"
        const val FILE_NAME ="primer.csv"
    }
}