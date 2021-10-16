<#import "parts/common.ftl" as c>
<@c.page>
    <form style=" padding: 20px; border:1px solid black; width: max-content" method="POST" action="/orders">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name1">Навза замовленя:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="name" required  placeholder="Введіть назву" id="name1">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name2">Номер замовника:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="phone" required pattern="[0-9]{3}[0-9]{3}[0-9]{4}" placeholder="Введіть номер" id="name2">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name3">Зборка:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="assembly" required placeholder="зборка" id="name3">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name4">Доставка:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="delivery" required placeholder="доставка" id="name4">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name5">Установка:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="assembling" required placeholder="монтаж" id="name5">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name6">Ціна:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="price" required pattern="^[ 0-9]+$" placeholder="Введіть ціну" id="name6">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name7">Задаток:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="deposit" required pattern="^[ 0-9]+$" placeholder="Введіть ціну" id="name7">
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name9">Кінцева дата:</label>
            <input style=" margin-left: 20px; width: 300px; outline: none " type="text" name="finishDate" required pattern="\d{1,2}\.\d{1,2}" placeholder="Введіть кінцеву дату" id="name9">
        </div>
        <button type="submit">Зберегти</button>
    </form>
</@c.page>