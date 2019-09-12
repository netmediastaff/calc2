/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holidu.interview.assignment.model;

/**
 *
 * @author oghomwen.aigbedion
 */
public class Tree {

    private String boro_ct;
    private String curb_loc;
    private String tree_id;
    private String steward;
    private String bin;
    private String latitude;
    private String created_at;
    private String boroname;
    private String zip_city;
    private String guards;
    private String trunk_wire;
    private String user_type;
    private String spc_common;
    private String nta;
    private String state;
    private String y_sp;
    private String brch_shoe;
    private String census_tract;
    private String longitude;
    private String stump_diam;
    private String sidewalk;
    private String st_senate;
    private String address;
    private String brch_other;
    private String trnk_other;
    private String cb_num;
    private String nta_name;
    private String cncldist;
    private String st_assem;
    private String health;
    private String tree_dbh;
    private String spc_latin;
    private String borocode;
    private String bbl;
    private String block_id;
    private String trnk_light;
    private String zipcode;
    private String x_sp;
    private String root_stone;
    private String root_other;
    private String root_grate;
    private String council_district;
    private String brch_light;
    private String status;
    private String problems;

    public Tree() {
    }

    public Tree(String spc_common, String y_sp, String x_sp) {
        this.spc_common = spc_common;
        this.y_sp = y_sp;
        this.x_sp = x_sp;
    }

    public String getBoro_ct() {
        return boro_ct;
    }

    public void setBoro_ct(String boro_ct) {
        this.boro_ct = boro_ct;
    }

    public String getCurb_loc() {
        return curb_loc;
    }

    public void setCurb_loc(String curb_loc) {
        this.curb_loc = curb_loc;
    }

    public String getTree_id() {
        return tree_id;
    }

    public void setTree_id(String tree_id) {
        this.tree_id = tree_id;
    }

    public String getSteward() {
        return steward;
    }

    public void setSteward(String steward) {
        this.steward = steward;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getBoroname() {
        return boroname;
    }

    public void setBoroname(String boroname) {
        this.boroname = boroname;
    }

    public String getZip_city() {
        return zip_city;
    }

    public void setZip_city(String zip_city) {
        this.zip_city = zip_city;
    }

    public String getGuards() {
        return guards;
    }

    public void setGuards(String guards) {
        this.guards = guards;
    }

    public String getTrunk_wire() {
        return trunk_wire;
    }

    public void setTrunk_wire(String trunk_wire) {
        this.trunk_wire = trunk_wire;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getSpc_common() {
        return spc_common;
    }

    public void setSpc_common(String spc_common) {
        this.spc_common = spc_common;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getY_sp() {
        return Double.parseDouble(y_sp);
    }

    public void setY_sp(String y_sp) {
        this.y_sp = y_sp;
    }

    public String getBrch_shoe() {
        return brch_shoe;
    }

    public void setBrch_shoe(String brch_shoe) {
        this.brch_shoe = brch_shoe;
    }

    public String getCensus_tract() {
        return census_tract;
    }

    public void setCensus_tract(String census_tract) {
        this.census_tract = census_tract;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStump_diam() {
        return stump_diam;
    }

    public void setStump_diam(String stump_diam) {
        this.stump_diam = stump_diam;
    }

    public String getSidewalk() {
        return sidewalk;
    }

    public void setSidewalk(String sidewalk) {
        this.sidewalk = sidewalk;
    }

    public String getSt_senate() {
        return st_senate;
    }

    public void setSt_senate(String st_senate) {
        this.st_senate = st_senate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrch_other() {
        return brch_other;
    }

    public void setBrch_other(String brch_other) {
        this.brch_other = brch_other;
    }

    public String getTrnk_other() {
        return trnk_other;
    }

    public void setTrnk_other(String trnk_other) {
        this.trnk_other = trnk_other;
    }

    public String getCb_num() {
        return cb_num;
    }

    public void setCb_num(String cb_num) {
        this.cb_num = cb_num;
    }

    public String getNta_name() {
        return nta_name;
    }

    public void setNta_name(String nta_name) {
        this.nta_name = nta_name;
    }

    public String getCncldist() {
        return cncldist;
    }

    public void setCncldist(String cncldist) {
        this.cncldist = cncldist;
    }

    public String getSt_assem() {
        return st_assem;
    }

    public void setSt_assem(String st_assem) {
        this.st_assem = st_assem;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getTree_dbh() {
        return tree_dbh;
    }

    public void setTree_dbh(String tree_dbh) {
        this.tree_dbh = tree_dbh;
    }

    public String getSpc_latin() {
        return spc_latin;
    }

    public void setSpc_latin(String spc_latin) {
        this.spc_latin = spc_latin;
    }

    public String getBorocode() {
        return borocode;
    }

    public void setBorocode(String borocode) {
        this.borocode = borocode;
    }

    public String getBbl() {
        return bbl;
    }

    public void setBbl(String bbl) {
        this.bbl = bbl;
    }

    public String getBlock_id() {
        return block_id;
    }

    public void setBlock_id(String block_id) {
        this.block_id = block_id;
    }

    public String getTrnk_light() {
        return trnk_light;
    }

    public void setTrnk_light(String trnk_light) {
        this.trnk_light = trnk_light;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public double getX_sp() {
        return Double.parseDouble(x_sp);
    }

    public void setX_sp(String x_sp) {
        this.x_sp = x_sp;
    }

    public String getRoot_stone() {
        return root_stone;
    }

    public void setRoot_stone(String root_stone) {
        this.root_stone = root_stone;
    }

    public String getRoot_other() {
        return root_other;
    }

    public void setRoot_other(String root_other) {
        this.root_other = root_other;
    }

    public String getRoot_grate() {
        return root_grate;
    }

    public void setRoot_grate(String root_grate) {
        this.root_grate = root_grate;
    }

    public String getCouncil_district() {
        return council_district;
    }

    public void setCouncil_district(String council_district) {
        this.council_district = council_district;
    }

    public String getBrch_light() {
        return brch_light;
    }

    public void setBrch_light(String brch_light) {
        this.brch_light = brch_light;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

}
