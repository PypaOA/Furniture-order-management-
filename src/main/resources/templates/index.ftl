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
    <#list orders as orderС>
        <tr style=" width: 100%; border: 1px solid black; background-color: rgba(88, 175, 127, 0.39)">
            <th>
                <a href="/orders/${orderС.id}">
            <b>${orderС.id}</b></a></th>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <th>
            <b>${orderС.name}</b></th>
            <th>
                <a href="/orders/indexPhone/${orderС.phone}">
            <b>${orderС.phone}</b></a></th>
            <th>
            <b>${orderС.price}</b></th>
            <th>
            <b>${orderС.deposit}</b></th>
            <th>
            <b>${orderС.surcharge}</b></th>
            <th>
            <b>${orderС.assembly}</b></th>
            <th>
            <b>${orderС.delivery}</b></th>
            <th>
            <b>${orderС.assembling}</b></th>
            <th>
            <b>${orderС.startDate}</b></th>
            <th>
            <b>${orderС.finishDate}</b></th>
        </tr>
    <#else>
        No order
    </#list>
</table>
<a href="/orders/new">Додати замовлення</a>
    <span><a href="/user">User list</a></span>
</@c.page>