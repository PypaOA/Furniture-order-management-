<#import "parts/common.ftl" as c>
<@c.page>
<table style="margin: 0 auto; width: 100%; text-align: center; border: 1px solid black">
    <tr style="  width: 100%; border: 1px solid black">
        <th>Замовлення</th>
        <th>Назва замовлення</th>
        <th>Телефон клієнта</th>
        <th>Ціна</th>
        <th>Внесено</th>
        <th>Залишок</th>
        <th>Зборка</th>
        <th>Доставка</th>
        <th>Установка</th>
        <th>Дата початку</th>
        <th>Дата закінчення</th>
    </tr>
    <#list orders as order>
        <tr style=" width: 100%; border: 1px solid black; background-color: rgba(88, 175, 127, 0.39)">
            <th>
                <a href="/orders/${order.id}">
            <b>${order.id}</b></a></th>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <th>
            <b>${order.name}</b></th>
            <th>
<#--                <a href="/orders/${order.phone}">-->
            <b>${order.phone}</b></th>
            <th>
            <b>${order.price}</b></th>
            <th>
            <b>${order.deposit}</b></th>
            <th>
            <b>${order.surcharge}</b></th>
            <th>
            <b>${order.assembly}</b></th>
            <th>
            <b>${order.delivery}</b></th>
            <th>
            <b>${order.assembling}</b></th>
            <th>
            <b>${order.startDate}</b></th>
            <th>
            <b>${order.finishDate}</b></th>
        </tr>
    <#else>
        No order
    </#list>
</table>
    <span><a href="/orders">Повернутись
        </a></span>
</@c.page>