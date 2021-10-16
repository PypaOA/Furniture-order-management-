<#import "parts/common.ftl" as c>
<@c.page>

    <#list orders as order>
<p text="Order #: ">№Замовлення: ${order.id}</p>
<p text="Order name: ">Назва замовлення: ${order.name}</p>
<p text="Order phone: ">Телефон клієнта: ${order.phone}</p>
<hr>
<p text="Price: ">Ціна: ${order.price}</p>
<p text="Deposit: ">Внесено: ${order.deposit}</p>
<p text="Surcharge: ">Залишок: ${order.surcharge}</p>
<hr>
<p text="Assembly: ">Зборка: ${order.assembly}</p>
<p text="Delivery: ">Доставка: ${order.delivery}</p>
<p text="Assembling: ">Установка: ${order.assembling}</p>
<hr>
<p text="Start date: ">Дата початку: ${order.startDate}</p>
<p text="Finish date: ">Дата закінчення: ${order.finishDate}</p>
<hr>

        <a href="/orders/${order.id}/edit">Edit</a>
        <form action="/orders/${order.id}" method="post">
            <input type="submit" value="Delete">
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        </form>

    <#else>
        No order
    </#list>
</@c.page>