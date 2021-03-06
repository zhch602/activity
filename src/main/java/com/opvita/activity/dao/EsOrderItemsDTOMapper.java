package com.opvita.activity.dao;

import com.opvita.activity.dto.EsOrderItemsDTO;
import com.opvita.activity.dto.EsOrderItemsDTOCriteria;
import com.opvita.activity.dto.EsOrderItemsDTOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsOrderItemsDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int countByExample(EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int deleteByExample(EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int insert(EsOrderItemsDTOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int insertSelective(EsOrderItemsDTOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    List<EsOrderItemsDTOWithBLOBs> selectByExampleWithBLOBs(EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    List<EsOrderItemsDTO> selectByExample(EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    EsOrderItemsDTOWithBLOBs selectByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EsOrderItemsDTOWithBLOBs record, @Param("example") EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") EsOrderItemsDTOWithBLOBs record, @Param("example") EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EsOrderItemsDTO record, @Param("example") EsOrderItemsDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EsOrderItemsDTOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(EsOrderItemsDTOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CULSITE.ES_ORDER_ITEMS
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EsOrderItemsDTO record);
}